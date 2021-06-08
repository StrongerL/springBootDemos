package com.example.jsr303demo.p01basic;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 基本的校验
 * 1. pom 中引入依赖 spring-boot-starter-validation
 * 2. bean 上添加校验注解
 * 3. controller 方法参数上启用校验
 */

@RestController
public class Controller1 {

    @PostMapping("/test/base")
    public void testBase(@Valid @RequestBody Entity1 entity1, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> m = new HashMap<>();
            bindingResult.getFieldErrors().
                    forEach(item -> m.put(item.getField(), item.getDefaultMessage()));
            System.out.println(m);
        } else {
            System.out.println(entity1);
        }
    }

}
