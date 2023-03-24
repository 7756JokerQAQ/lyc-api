package com.yupi.lycapiinterface.controller;

import com.lyc.lycapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/name")
public class NameController {


    @GetMapping("/get")
    public String getNameByGet(String name){
        String[] split = name.split(":");
        return "Get 你的名字为"+split[1];
    }

    @PostMapping("/post")
    public String getNameByPost(String name){
        return "Post 你的名字为"+name;
    }


    @PostMapping("/user")
    public String getNameByPost(@RequestBody User user){
//        String accessKey = request.getHeader("accessKey");
//        String nonce=request.getHeader("nonce");
//        String timestamp=request.getHeader("timestamp");
//        String sign=request.getHeader("sign");
//        String body=request.getHeader("body");
//        if(!accessKey.equals("yupi")){
//            throw new RuntimeException("无权限");
//        }
//        if(Long.parseLong(nonce)>10000){
//            throw new RuntimeException("无权限");
//        }
//        String serverSign= SignUtils.getSign(body,"abcdefg");
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        return "Post 用户的名字为"+user.getUserName();
    }
}
