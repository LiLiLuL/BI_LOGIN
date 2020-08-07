package com.tianma.BI_Process;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerEndpointConfig.Configurator;

import org.apache.catalina.session.StandardSessionFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//将HttpSession加入到MyWebScoket
public class GetHttpSessionConfigurator extends   Configurator{
	private static final Logger log=LoggerFactory.getLogger(WebSocketConfig.class);
	  @Override
	  public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
		  StandardSessionFacade ssf=(StandardSessionFacade) request.getHttpSession();
		  if(ssf!=null) {
			  HttpSession httpSession=(HttpSession) request.getHttpSession();
			  sec.getUserProperties().put("sessionId", httpSession.getId());
			  log.info("获取到的SessionID:"+httpSession.getId());
		  }
		  super.modifyHandshake(sec, request, response);
		  
		  
	  }
	  

}
