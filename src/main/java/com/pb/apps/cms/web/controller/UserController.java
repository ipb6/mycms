package com.pb.apps.cms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.apps.cms.bean.BaseUser;
import com.pb.apps.cms.bean.extend.BaseUserExtend;
import com.pb.apps.cms.services.IBaseUserService;
import com.pb.apps.cms.utils.Message;
import com.pb.apps.cms.utils.MessageUtil;
import com.pb.apps.cms.vm.UserVM;

import io.swagger.annotations.ApiOperation;

/**

* @类说明 
* @Title UserController.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午9:56:25

*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IBaseUserService baseUserService;

    @PostMapping("login")
    public Message login(@RequestBody UserVM userVM){
        // 3. 如果登录失败
        Map<String,String> map = new HashMap<>();
        map.put("token","admin-token");
        return MessageUtil.success(map);
    }

    @ApiOperation(value = "通过token获取用户的基本信息")
    @GetMapping("info")
    public Message info(String token){
        // 1. 通过token获取用户信息  {id,use,gender,roles:[]}
        BaseUserExtend baseUserExtend = baseUserService.findById(1L);
        return MessageUtil.success(baseUserExtend);
    }

    @PostMapping("logout")
    public Message logout(){
        // 1. 登录， token从缓存中移除掉
        return MessageUtil.success("退出成功");
    }


}
