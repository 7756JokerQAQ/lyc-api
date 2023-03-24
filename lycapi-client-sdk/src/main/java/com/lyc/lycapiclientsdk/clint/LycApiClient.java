package com.lyc.lycapiclientsdk.clint;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lyc.lycapiclientsdk.model.User;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lyc.lycapiclientsdk.utils.SignUtils.getSign;


/**
 * 调用第三方接口客户段
 */
public class LycApiClient {
    private String accessKey;
    private String secretKey;
    private String GATEWAY_HOST="http://localhost:8090";
    private String COMMON_HOST="http://localhost:8123";
    private Map<String,String> getHeadMap(String body){
        Map<String,String > hashMap=new HashMap<>();
        hashMap.put("accessKey",accessKey);
        //一定不能在服务器中传输密码
      //  hashMap.put("secretKey",secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis()/1000));
        hashMap.put("sign",getSign(body,secretKey));

        return hashMap;
    }
    public LycApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result3= HttpUtil.get(COMMON_HOST+ "/api/name/get", paramMap);
        System.out.println(result3);
        return  result3;
    }


    public String getNameByPost(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
       String result3= HttpUtil.post(GATEWAY_HOST+"/api/name/", paramMap);
        System.out.println(result3);
        return  result3;
    }

    public String getUserNameByPost(User user){
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST+"/api/name/user")
                .addHeaders(getHeadMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }

    public Object getCommon(Object obj){
        List<String> tempList=new ArrayList<>();

        if(obj.getClass()==User.class){
          return  getUserNameByPost((User) obj);
        }
        if(obj.getClass()==String.class){
         return  getNameByPost((String)obj);
        }
        return null;
    }
}
