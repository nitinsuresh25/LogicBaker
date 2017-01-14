package com.logicbaker.mathutil.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.logicbaker.mathutil.adder.Adder;

@Controller
@RequestMapping("/")
public class MathUtilController {
 
    @RequestMapping(method = RequestMethod.GET,value = "/hello2")
    @ResponseBody
    public String sayHello(ModelMap model) {
         return "welcome";
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/add/{number1}/{number2}")
    @ResponseBody
    public String logicBakeAdd(@PathVariable int number1,@PathVariable int number2) {
    	return Adder.add(number1, number2)+"";
    }

  @RequestMapping(method = RequestMethod.GET,value = "/sub/{number1}/{number2}")
    @ResponseBody
    public String logicBakeAdd(@PathVariable int number1,@PathVariable int number2) {
    	return sub.sub(number1, number2)+"";
    }
 
   
 
}
