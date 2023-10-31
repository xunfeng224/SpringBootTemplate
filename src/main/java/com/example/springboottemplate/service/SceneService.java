package com.example.springboottemplate.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboottemplate.entity.Scene;

import java.util.List;

/**
 * @program: cacheDemo
 * @description:
 * @author: xiongfeng
 * @create: 2023-05-17 20:53
 **/
public interface SceneService extends IService<Scene> {
    List<Scene> listScene(String str);

    Scene getSceneById(Long sceneId);
}
