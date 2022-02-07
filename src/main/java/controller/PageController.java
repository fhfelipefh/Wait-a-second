package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.PageService;

@Controller
public class PageController {

  @Autowired
  private PageService pageService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView getIndexPage() {
    ModelAndView mav = new ModelAndView("index");
    mav.addObject("index");
    return mav;
  }



}
