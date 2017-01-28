package com.sample.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.service.HomeService;

@Controller
public class HomeController {

  //private static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
  private HomeService service;
  
  @Autowired
  public HomeController(HomeService homeService) {
    this.service = homeService;
  }
  
  @RequestMapping(value="/", method = RequestMethod.GET)
  public String index(Map<String, Object> model){
    //LOGGER.debug("index() is executed.");
    
    model.put("title", service.getTitle(""));
    model.put("msg", service.getMsg());
    
    return "index";
  }
  
  @RequestMapping(value="/hello/{name:.+}", method = RequestMethod.GET)
  public ModelAndView hello(@PathVariable String name){
    //LOGGER.debug("hello() is executed. name = "+name);
    ModelAndView model = new ModelAndView();
    
    model.setViewName("index");
    model.getModel().put("title", service.getTitle(name));
    model.getModel().put("msg", service.getMsg());
    
    return model;
  }
   

}
