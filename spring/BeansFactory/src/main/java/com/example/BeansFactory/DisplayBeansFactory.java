package com.example.BeansFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisplayBeansFactory {
    private int count;
    private List beansNameList;

    public void DisplayBeansFactory(int count,List beansNameList) {
        this.count = count;
        this.beansNameList = beansNameList;
    }

    @RequestMapping("/")
    public String displayBeansFactoryDetails() {
        String str = "THE COUNT OF EXPLICIT BEANS USED BY APPLICATION: " + count;
        str += String.format("%n");
        str += "THE NAMES OF EXPLICIT BEANS : " + beansNameList;
        return str;
    }

}
