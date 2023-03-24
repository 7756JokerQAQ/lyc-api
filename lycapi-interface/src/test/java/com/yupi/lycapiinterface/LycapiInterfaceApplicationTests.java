package com.yupi.lycapiinterface;

import com.lyc.lycapiclientsdk.clint.LycApiClient;

import com.lyc.lycapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;

@SpringBootTest
class LycapiInterfaceApplicationTests {
    @Resource
    private LycApiClient lycApiClient;
    @Test
    void contextLoads() {

        String result = lycApiClient.getNameByGet("yupi");
        User user = new User();
        user.setUserName("aaa");
        String usernameByPost = lycApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);

    }

}
