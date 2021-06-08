package com.example.unifiedresponsedemo;


import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }


    public R() {
        put("code", 0);
        put("msg", "success");
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error() {
        return error(500, "未知异常");
    }


    public static R ok() {
        return new R();
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public Integer getCode() {
        return (Integer) this.get("code");
    }


}
