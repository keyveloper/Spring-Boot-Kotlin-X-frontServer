package com.example.frontServer.config;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/frontServer/config/WebConfig;", "Lorg/springframework/web/servlet/config/annotation/WebMvcConfigurer;", "()V", "createWebClient", "Lorg/springframework/web/reactive/function/client/WebClient;", "baseUrl", "", "frontServer"})
public class WebConfig implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    
    public WebConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.reactive.function.client.WebClient createWebClient(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
}