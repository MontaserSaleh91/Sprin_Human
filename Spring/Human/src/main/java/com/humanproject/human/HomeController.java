package com.humanproject.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String searchQuery){
    	if (searchQuery == null) {
    		return "<h1>Hello Human!</h1><br>Welcome to spring boot!";
    	}
    	else {
    		return "<h1>Hello " + searchQuery + "<br></h1> Welcom to spring boot!" ;
    	}
    }
}
