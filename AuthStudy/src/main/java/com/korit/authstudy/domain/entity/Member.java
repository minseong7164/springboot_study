package com.korit.authstudy.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // @AllArgsConstructor가 필요하다
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "members_tb")

public class Member {
    @Id // pk 세팅
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ai 세팅
    @Column(name = "member_id")
    private Integer id; // 1
    private String memberName;
    private String password;
    private String name;
    private String email;
// 데이베이스명이나 테이블명이 잘못된경우
//
     // 테이블 -> entity 만들기 -> @entity-> @table
}
