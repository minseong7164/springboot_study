package com.korit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
// 서블릿은 톰캣을 실행을해서 프로젝트를 찾고 springboot은 프로젝트를 실행시켜서 톰캣이 실행된다.
@RestController
@RequestMapping("/api")
public class HttpStudyController {
    //responsebody가 있으면 데이터 응답을 하겠다.
    @GetMapping("/http")
    public String get() {
        return "";
    }
    // https://iyk2h.tistory.com/147
    @GetMapping("/name")
    public String getName() {
        return "김민성";
    }
}
