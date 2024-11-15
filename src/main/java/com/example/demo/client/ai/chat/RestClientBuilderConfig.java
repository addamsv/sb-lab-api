package com.example.demo.client.ai.chat;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.JdkClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RestClientBuilderConfig {

  @Bean
  public RestClient.Builder restClientBuilder() {
    return RestClient.builder()
        .requestFactory(new JdkClientHttpRequestFactory());
  }

}
