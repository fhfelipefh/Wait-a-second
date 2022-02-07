package repository;

import com.fasterxml.jackson.annotation.JsonFormat;
import enums.Role;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "auth")
public class Auth {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  private String username;

  @NotBlank
  @Lob
  private String password;

  @Transient
  private SessionToken sessionToken;

  @NotBlank
  private Role role;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
  private LocalDate createdAt;

  @NotBlank
  private String secretPhrase;

  private LocalDate lastLoginAttempt;

  private LocalDate lastLoginSuccess;

  private int loginAttempts;

  private boolean userBlocked;

  public Auth() {}

}