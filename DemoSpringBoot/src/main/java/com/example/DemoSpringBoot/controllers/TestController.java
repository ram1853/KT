package com.example.DemoSpringBoot.controllers;

import com.example.DemoSpringBoot.configuration.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//http://localhost:8080/customGetMethod/1 => URI, 1 => Path parameter
@RestController //jackson library
@RequestMapping("/") //get,post,put,delete...all http methods.
public class TestController {

    @Autowired
    Environment environment;

    @Autowired
    CustomConfig customConfig;

    @Value("${employee.name}")
    private String name;

    @GetMapping("customeGetMethod/{id}") //URI (resource) & URL (bla..google.com)
    public MyModel getTestMethod(@PathVariable("id") String xyzz){
        MyModel myModel = new MyModel("test data");
        System.out.println("reading property--->"+environment.getProperty("employee.location"));
        System.out.println("reading property--->"+name);
        System.out.println("reading property--->"+customConfig.getAddress());
        return myModel;

    }

    @PostMapping("/xyz")
        public String postTestMethod(){
            return "my post method";
        }
}
