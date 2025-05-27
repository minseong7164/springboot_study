package com.korit.springboot.controller;

import com.korit.springboot.ioc.BeanStudy;
import com.korit.springboot.ioc.스마트폰;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Beans;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class IoCController {

//    @Autowired      // 자동으로 객체를 생성
    private 스마트폰 s;
    private BeanStudy beanStudy;

    @GetMapping("/ioc")
    public String get() {
        s.전원켜기();
        return null;
    }

    @GetMapping("/ioc2")
    public String get2() {
        s.전원켜기();
        return null;
    }
}
