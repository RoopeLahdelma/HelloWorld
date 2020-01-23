package com.example.helloworld10.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class HelloControl {
@RequestMapping("*")
public String hello() {
return "Hello Spring";
}
@RequestMapping("/index")
public String Main() {
return "This is the main page";
}
@RequestMapping("/contact")
public String Contact() {
return "This is the contact page";
}

@RequestMapping("/hello")
public String Hello(@RequestParam (name="location") String Location, @RequestParam (name="name") String Name) {
	return "Welcome to the " + Location + " " + Name;
}
}
