package com.korit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

// 요청 URL : /api/age 응답 데이터: { name: 김준일, age :32 }
// 요청 URL : /api/names 응답 데이터: {"김준일", "김준이", "김준삼"} /list
// 요청 URL : /api/students 응답 데이터: {{name: 김준일, age :32 },{name: 김준이, age :33 }}
// 요청 URL : /api/students2 응답 데이터:
/*
    [
        {
            name: 김준일,
            age: 32,
            hobby: [축구, 농구]
        },
        {
            name: 김준이,
            age: 33,
            hobby: [골프, 낚시]
        }
    ]
 */
@RestController
public class HttpStudyController2 {
    @GetMapping("/api/age")
    public Map<String, Object> age() {
        Map<String, Object> map = new HashMap<>();
        map.put("name","김준일");
        map.put("age",32);

        Map<String, Object> map2 = Map.of("name", "김준일", "age", 32); // 불변 Map 이기 때문에 값을 추가할수가 없다.
        return map;
    }

//    @GetMapping("/api/names")
//    public List<String> getName() {
//        List<String> name = new ArrayList<>();
//        name.add("김준일");
//        name.add("김준이");
//        name.add("김준삼");
//        return name;
//    }

    @GetMapping("/api/names")
    public String[] names() {
        String[] names = {"김준일", "김준이", "김준삼"};
        Object obj = new String[]{"김준일", "김준이", "김준삼"};
        return names;
    }

    @GetMapping("api/students")
    public List<Map<String,Object>> students() {
        List<Map<String,Object>> list = new ArrayList<>();
        Map <String,Object> map1 = new HashMap<>();
        map1.put("name","김준일");
        map1.put("age", 32);
        Map <String,Object> map2 = new HashMap<>();
        map2.put("name","김준이");
        map2.put("age",33);

        list.add(map1);
        list.add(map2);

        List<Map<String, Object>> list2 = List.of(map1, map2);

        return List.of(
                Map.of("name", "김준일","age", 32),
                Map.of("name","김준이", "age", 33)
        );
    }
//@GetMapping("api/students")
//    public List<Map<String,Object>> students() {
//        List<Map<String,Object>> students(){
//            return List.of(
//                    Map.of("name", "김준일","age", 32),
//                    Map.of("name","김준이", "age", 33)
//            );
//    }


    @GetMapping("api/students2")
    public List<Map<String,Object>> getStudent2() {
        List<Map<String,Object>> students2 = new ArrayList<>();
        Map <String,Object> student = new HashMap<>();
        List<String> hobby = new ArrayList<>();
        List<String> hobby2 = new ArrayList<>();
            Map <String,Object> student1 = new HashMap<>();
            student1.put("name","김준일");
            student1.put("age", 32);
            hobby.add("축구");
            hobby.add("농구");
            student1.put("hobby",hobby);
            Map <String,Object> student2 = new HashMap<>();
            student2.put("name","김준이");
            student2.put("age",33);
            hobby2.add("골프");
            hobby2.add("낚시");
            student2.put("hobby2",hobby2);
            return List.of(student1,student2);

    }

}
