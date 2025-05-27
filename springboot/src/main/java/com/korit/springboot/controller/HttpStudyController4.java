package com.korit.springboot.controller;

/*
 * REST API(RESTful API)
 * 요청과 응답
 * https://m.blog.naver.com/codingbarbie/223233477242
 * https://hahahoho5915.tistory.com/54
 * https://www.tcpschool.com/mysql/DB#google_vignette
 */
/*
    docker 명령어
    $ docker-compose -f mysql-compose.yml up -d
 */

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HttpStudyController4 {

    @GetMapping("/api/study/http/get")
    public ResponseEntity<Map<String, Object>> get() {
//        return new ResponseEntity<>(Map.of("name", "김준일", "age", "32"), HttpStatus.BAD_REQUEST);
        return ResponseEntity.badRequest().body(Map.of("name", "김준일", "age", "32"));
    }
}
