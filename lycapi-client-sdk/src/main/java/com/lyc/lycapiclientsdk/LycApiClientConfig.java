package com.lyc.lycapiclientsdk;
import com.lyc.lycapiclientsdk.clint.LycApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("lycapi.clint")
@Data
@ComponentScan
public class LycApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public LycApiClient lycApiClient(){
        return new LycApiClient(accessKey,secretKey);
    }
}
