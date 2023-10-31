package com.example.springboottemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottemplate.entity.Scene;
import com.example.springboottemplate.mapper.SceneMapper;
import com.example.springboottemplate.service.SceneService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: cacheDemo
 * @description:
 * @author: xiongfeng
 * @create: 2023-05-17 20:53
 **/
@Service
public class SceneServiceImpl extends ServiceImpl<SceneMapper, Scene> implements SceneService {
    @Override
    public List<Scene> listScene(String str) {
        return this.list();
    }

    @Override
    public Scene getSceneById(Long sceneId) {
        return this.getById(sceneId);
    }
    public List<Scene> listScene2(String str) {
        return this.list();
    }
}
