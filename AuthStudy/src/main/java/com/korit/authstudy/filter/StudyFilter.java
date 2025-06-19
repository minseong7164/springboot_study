package com.korit.authstudy.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
//https://siyoon210.tistory.com/32
@Component
public class StudyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("전처리");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("후처리");
    }
}
