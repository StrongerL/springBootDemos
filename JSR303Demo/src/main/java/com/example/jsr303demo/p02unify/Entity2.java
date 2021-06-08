package com.example.jsr303demo.p02unify;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Entity2 {

    @NotBlank(message = "该属性不能为空")
    private String property1;

    @Min(message = "该属性最小值为1", value = 1)
    private Integer property2;

}
