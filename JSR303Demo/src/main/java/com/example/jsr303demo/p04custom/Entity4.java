package com.example.jsr303demo.p04custom;

import lombok.Data;

@Data
public class Entity4 {

    @ListValue(values = {0, 1})
    private Integer property1;

}
