package com.hygod.controller;


import com.hygod.hygodclintsdk.model.User;
import com.hygod.hygodclintsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hygod
 * @Date: 2023/2/24
 * @Time: 18:53
 * @Description:
 */
@RestController()
@RequestMapping("/name")
public class NameController {

    @GetMapping("/")
    public String getNameByGet(String name) {
        return "Get 你的名字是"+name;
    }


    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "Post 你的名字是"+name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
////        todo 实际是去数据库查看是否已经分配给用户

//        if(!accessKey.equals("hygod")){
//            throw new RuntimeException("无权限");
//        }
////        todo 暂时不校验随机数
//
//        if(Long.parseLong(nonce) >10000){
//            throw new RuntimeException("无权限");
//        }
////        todo 时间和当前时间不能超过5分钟(待完成）
//
////        todo 实际是去数据库查，现在先直接给
//        String serverSign = SignUtils.getSign(body, "hygod");
//
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }

        return "Post 用户名字是"+user.getUsername();
    }
}
