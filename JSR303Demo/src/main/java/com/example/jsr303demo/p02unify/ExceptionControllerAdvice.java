package com.example.jsr303demo.p02unify;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(value= MethodArgumentNotValidException.class)
    public void handleValidException(MethodArgumentNotValidException e){

        BindingResult bindingResult = e.getBindingResult();
        Map<String,String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError)->{
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        System.out.println(BizCodeEnum.VALID_EXCEPTION.getCode());
        System.out.println(BizCodeEnum.VALID_EXCEPTION.getMsg());
        System.out.println(errorMap);

    }

    @ExceptionHandler(value = Throwable.class)
    public void handleUnknownException(Throwable t) {
        System.out.println(BizCodeEnum.UNKNOWN_EXCEPTION.getCode());
        System.out.println(BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
        System.out.println(t.getMessage());
    }


}
