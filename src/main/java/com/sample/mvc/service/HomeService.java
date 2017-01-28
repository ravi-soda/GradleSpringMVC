package com.sample.mvc.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HomeService {

  //private static final Logger LOGGER = LoggerFactory.getLogger(HomeService.class);
  
  public String getTitle(String name) {
    //LOGGER.debug("Inside getTitle() method");
    
    if(!StringUtils.isEmpty(name)){
      return "Hello "+name+" !!";
    } else {
      return "Hello World !!";
    }
  }

  public Object getMsg() {
    
    //LOGGER.debug("Inside getMsg() method");
    
    return "First Gradle Spring MVC web application.";
  }

  
  
}
