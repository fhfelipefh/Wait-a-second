package repository;

import com.auth0.jwt.algorithms.Algorithm;
import enums.Role;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "session_token")
public class SessionToken {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String token_id;

  @NotBlank
  private String username;

  @NotBlank
  @Lob
  private String token;

  private Role role;

  private LocalDate expirationDate;


  public SessionToken() {}

}
