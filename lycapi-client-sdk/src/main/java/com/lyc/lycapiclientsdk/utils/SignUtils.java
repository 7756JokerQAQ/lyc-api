package com.lyc.lycapiclientsdk.utils;


import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUtils {
    public  static  String  getSign(String body,String secretKey){
        //生成签名认证
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content=body+"."+secretKey;
        return md5.digestHex(content);

    }
}
