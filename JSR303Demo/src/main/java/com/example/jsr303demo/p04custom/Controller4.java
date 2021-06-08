package com.example.jsr303demo.p04custom;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义校验注解
 * 使用情况：框架的校验注解不足以实现需求，需要自定义注解校验
 * 1. 创建一个注解，message 属性指明错误信息并创建 ValidationMessages.properties ，在其中写出错误信息（或者直接写字符串）
 * 2. 创建对应的校验器处理该注解标注的属性
 * 3. 像使用普通的校验注解一样使用自己自定义的注解
 */
@RestController
public class Controller4 {

    @PostMapping("/test/custom")
    public void testCustom(@Validated @RequestBody Entity4 entity4) {
        System.out.println(entity4);
    }

}
