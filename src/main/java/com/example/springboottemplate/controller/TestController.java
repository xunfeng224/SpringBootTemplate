package com.example.springboottemplate.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboottemplate.entity.Scene;
import com.example.springboottemplate.service.SceneService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiongfeng
 * @date 2023/5/16
 */
@RestController
@RequiredArgsConstructor
public class TestController {

    private final SceneService sceneService;
    private final StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test")
    public String test(HttpServletRequest request) throws InterruptedException {
        return "000";
    }

    @GetMapping("/testCache")
    public List<Scene> testMultiCache() {
        stringRedisTemplate.opsForValue().set("a","b");
        return null;
    }

}