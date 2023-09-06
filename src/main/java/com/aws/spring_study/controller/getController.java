package com.aws.spring_study.controller;

import com.aws.spring_study.controller.dto.ParamsTestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {
    /*    public Object paramsTest(@RequestParam("name") String name, @RequestParam("age") int age) {
    변수명과 파라미터명이 같으면, Param 뒤에 적지않아도 된다.
            public Object paramsTest1(@RequestParam() String name, @RequestParam() int age) {
    파라미터의 이름과 HTTP 요청에서 전달되는 파라미터의 이름이 일치하면 @RequestParam 어노테이션을 생략가능하다
    but! 어노테이션이 있으면 필수값이 된다. 해당값을 요청하지 않으면 오류뜬다.*/

    @GetMapping("/get/params/1")
    public Object paramsTest1(@RequestParam String name,  Integer age) {
        System.out.println(name);
        System.out.println(age);
        return null;
    }
    @GetMapping("/get/params/2")
    public Object paramsTest2(ParamsTestDto paramTestDto) {
        System.out.println(paramTestDto);
        return null;
    }

    //"" 안에 '{}' 안에 파라미터 파라미터명을 넣으면 파라미터로 값이 들어간다.
    @GetMapping("/get/{id}")
    public Object pathVariable(@PathVariable("id") int id) {
        System.out.println(id);
        return null;
    }


}
