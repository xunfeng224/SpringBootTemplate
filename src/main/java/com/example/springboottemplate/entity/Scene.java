package com.example.springboottemplate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: cacheDemo
 * @description:
 * @author: xiongfeng
 * @create: 2023-05-17 20:50
 **/
@Data
@TableName("t_scene")
@AllArgsConstructor
public class Scene implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(
            value = "id",
            type = IdType.AUTO
    )
    private Long id;
    /**
     * 场景名称
     */
    private String sceneName;

}
