package com.example.jsr303demo.p03group;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分组校验异常
 * 适用情况：在不同的情形下对同一个 bean 有不同的校验要求
 * 1. 创建接口用于标记不同的分组
 * 2. 在 bean 中属性的注解上添加分组
 * 3. 在 controller 中启用校验时指定分组
 * 4. 方法中声明了分组，就只校验该分组标注的属性，其他属性不校验；方法中没有声明分组，就只校验没有标注分组的属性，其他属性不校验。
 */
@RestController
public class Controller3 {

    /**
     * 只校验 Entity3 中标注了 AddGroup.class 的属性，即 property1、property2
     */
    @PostMapping("/test/group/add")
    public void testGroupAdd(@Validated(AddGroup.class) @RequestBody Entity3 entity3) {
        System.out.println(entity3);
    }

    /**
     * 只校验 Entity3 中标注了 UpdateGroup.class 的属性，即 property2
     */
    @PostMapping("/test/group/update")
    public void testGroupUpdate(@Validated(UpdateGroup.class) @RequestBody Entity3 entity3) {
        System.out.println(entity3);
    }

    /**
     * 只校验 Entity3 中没有标注分组的属性，即 property3
     */
    @PostMapping("/test/group/other")
    public void testGroupOther(@Validated @RequestBody Entity3 entity3) {
        System.out.println(entity3);
    }

}
