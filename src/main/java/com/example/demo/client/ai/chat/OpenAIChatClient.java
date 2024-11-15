package com.example.demo.client.ai.chat;

import com.example.demo.client.ai.chat.dto.ChatRequest;
import com.example.demo.client.ai.chat.dto.ChatResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class OpenAIChatClient implements ChatClient{

//  private final RestClient restClient;

  @Override
  public ChatResponse generate(ChatRequest chatRequest) {
    return null;
  }

}
