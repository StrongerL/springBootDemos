package com.example.jsr303demo.p02unify;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 统一对异常进行处理
 * 1. 使用枚举定义异常的代码和信息，如本例中的 BizCodeEnum 类
 * 2. 新建一个类用来处理异常，在该类上标注 @RestControllerAdvice 注解
 * 3. 针对不同异常，编写处理逻辑
 */
@RestController
public class Controller2 {

    @PostMapping("/test/unify")
    public void testUnify(@Valid @RequestBody Entity2 entity2) {
        System.out.println(entity2);
    }

}
