package com.tianma.BI_Process;

import javax.websocket.server.ServerEndpoint;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

//配置websocket和stomp进行消息传递
@Configuration
@EnableWebSocketMessageBroker
@ConditionalOnWebApplication
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	 @Override
	public void registerStompEndpoints(StompEndpointRegistry registry){
		//注册一个Stomp协议的endpoint指定URL为websocket,并用.withSockJS()指定 SockJS协议。.setAllowedOrigins("*")设置跨域
         registry.addEndpoint("/websocket").setAllowedOrigins("*").withSockJS();
	}
	@Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //配置消息代理(message broker)
        //将消息传回给以‘/topic’开头的客户端
        config.enableSimpleBroker("/topic/{userCode}");
    }

//	@Bean
//	public ServerEndpointExporter serverEndpointExporter() {
//		return new ServerEndpointExporter();
//	}

}
