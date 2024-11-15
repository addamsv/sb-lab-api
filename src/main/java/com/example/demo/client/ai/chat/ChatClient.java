package com.example.demo.client.ai.chat;

import com.example.demo.client.ai.chat.dto.ChatRequest;
import com.example.demo.client.ai.chat.dto.ChatResponse;

public interface ChatClient {

  ChatResponse generate(ChatRequest chatRequest);

}
