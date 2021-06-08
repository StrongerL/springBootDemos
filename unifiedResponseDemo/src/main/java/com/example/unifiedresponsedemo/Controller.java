package com.example.unifiedresponsedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/response/ok")
    public R getResponse() {
        return R.ok().put("entity", new Entity());
    }


    @GetMapping("/response/error")
    public R getResponseError() {
        return R.error("这是错误信息");
    }

}
