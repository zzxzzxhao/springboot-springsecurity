package com.deceen.demo.controller;

import com.deceen.common.Enums.ResultEnum;
import com.deceen.common.VO.ResultVO;
import com.deceen.demo.entity.DemoEntity;
import com.deceen.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: zzx
 * @date: 2018/10/25 16:48
 * @description: demo
 */
@RestController
@RequestMapping("/test")
public class DemoController {

    @Autowired
    private DemoService orderService;

    @RequestMapping("/getUser")
    public List<DemoEntity> getUser(){
        List<DemoEntity> result = orderService.getUser();
        return result;
    }

    /**
     * 简单注册功能
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/register")
    public Map<String, Object> register(String username,String password){
        orderService.register(username,password);
        return ResultVO.result(ResultEnum.SUCCESS,true);
    }
}
