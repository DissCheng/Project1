package com.lzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzu.pojo.website;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins = "http://example.com:8080")
@Controller
public class HomeController {

    @RequestMapping("/message")
    public String message() {

        return "showMessage";
    }
   
    @GetMapping("/path")
    public String getMethodName() {
        return "showPath";
    }
    

    @RequestMapping("/about")
    @ResponseBody
    public String about(String name,int age) {
        System.out.println("This is about page.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
       return "{info: 'This is about page.'}"; 
    }

    @RequestMapping("/setWebConfig")
    public void setWebConfig(website wb) {
        System.out.println("URL: " + wb.url);
        System.out.println("Title: " + wb.title);        
        System.out.println("Content: " + wb.content);
        System.out.println("Address: " + wb.ad.city + " " + wb.ad.street);
    }

    @RequestMapping("/getWebJson")
    @ResponseBody
    public website getWebJson(website wb) {

        return wb;
    }
}

