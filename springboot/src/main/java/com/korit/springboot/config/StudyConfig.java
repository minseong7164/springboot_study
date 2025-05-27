package com.korit.springboot.config;

import com.korit.springboot.ioc.BeanStudy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudyConfig {

    @Bean
    public BeanStudy beanStudy() {
        System.out.println("bean 생성");
        return new BeanStudy();
    }

//    @Bean
//    public Criteria criteria() {      // 외부라이브러리에서 사용된걸 사용하고 싶을때도 활용한다.
//        return new Criteria();        // Bean은 여러개 객체를 생성할 수 있다.
//    }

}
