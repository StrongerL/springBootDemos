package com.example.jsr303demo.p03group;

import lombok.Data;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Entity3 {

    @NotBlank(message = "该属性不能为空", groups = AddGroup.class)
    private String property1;

    @Min(message = "该属性最小值为1", value = 1, groups = {AddGroup.class, UpdateGroup.class})
    private Integer property2;

    @AssertFalse
    private Boolean property3;

}
