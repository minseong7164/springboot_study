package com.korit.authstudy.controller;

import com.korit.authstudy.dto.MemberRegisterDto;
import com.korit.authstudy.service.MembersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/members") // 요청이 연결되는 부분
@RequiredArgsConstructor
public class MemberController {

    private final MembersService membersService; //@RequiredArgsConstructor하는 이유
    @PostMapping // postMapping의 주소를 생략하면 requestMapping의 주소로 연결된다
    public ResponseEntity<?> registerMember(@RequestBody MemberRegisterDto dto) {
        log.info("DTO: {}", dto);
        return ResponseEntity.ok(membersService.register(dto)); // 응답
    }
//    @GetMapping("/api/members")
//    public ResponseEntity<?> getUser() {}
}
