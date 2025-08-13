package com.codekamal.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        String viewName = getViewName();
        System.out.println(viewName);
        return viewName;
    }

    private String getViewName(){
        return "index.html";
    }
}
