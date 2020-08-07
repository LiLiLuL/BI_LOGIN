package com.tianma.BI_Process.Dto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.SpringConfigurator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tianma.BI_Process.GetHttpSessionConfigurator;
import com.tianma.BI_Process.Domain.UserFormInfo;
import com.tianma.BI_Process.Service.ApprovalService;

import springfox.documentation.spring.web.json.Json;


//发送消息
@ServerEndpoint(value = "/topic/{userCode}",encoders = {MyEncoder.class})
@Component
public class MyWebSocket {
	
	@Autowired
	private SimpMessagingTemplate SimpMessagingTemplate; //消息发送模板
	
	static Logger log = LoggerFactory.getLogger(MyWebSocket.class);
	//当前在线连接数
	private static int onlineCount=0;
	//concurrent包的线程安全set,用来存放每个客户端对应的mywebsocket对象
	private static ConcurrentHashMap<String,Session> webSocketSet=new ConcurrentHashMap<>();
	//与某个客户端的会话，通过此会话与客户端发送消息
	private Session session;
	//指定的sid，具有唯一性，暫定為用户的userCode
    private String sid = "";
    ExecutorService service = Executors.newFixedThreadPool(5);
    //此处是解决无法注入的关键
    private static ApplicationContext applicationContext;
    //你要注入的service或者dao
    private static ApprovalService appService;
    @Autowired
    public void setAppService(ApprovalService appService) {
    	MyWebSocket.appService=appService;
    }


    
    
    /**
     * 连接成功调用的方法
     */
    @OnOpen
    public void onOpen(@PathParam("userCode") String id,Session session) {
    	this.session=session;
    	
    	webSocketSet.put(id, session);
    	addOnlineCount();
          
        }

   
    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        log.info("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到来自窗口" + message + "的信息:" + message);
    
        //发给特定的人
        List<UserFormInfo>userFormInfos=appService.theInfo(message);
        Map<String, List> totalPushMsgs=new HashMap<>();
        totalPushMsgs.put(message, userFormInfos);
        Iterator iter=totalPushMsgs.entrySet().iterator();
       if(totalPushMsgs != null && !totalPushMsgs.isEmpty()) {
       	while (iter.hasNext()) {
				try {
					 Map.Entry<String,List> entry=(Map.Entry<String,List>)iter.next();
					sendMessage(entry.getKey(),entry.getValue());
					 System.out.println(entry.getValue());
				} catch (Exception e2) {
					// TODO: handle exception
				}
       	}
       }
    }
  

   
    

    
    
    /**
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        error.printStackTrace();
    }

	

    
//    public void sendMessage(UserFormInfo message) throws IOException {
//    	     try {
//				this.session.getBasicRemote().sendObject(message);
//			} catch (Exception e) {
//	            log.error("发送消息异常-->", e);
//			}
//		
//	}
 
 
      public void sendMessage(String id,List list) throws IOException{
    		try {
    			Map<String,List> map=new HashMap<>();
    			map.put(id, list);
    			this.session.getBasicRemote().sendObject(map);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
  			

    	

          
      }
		public static synchronized int getOnlineCount() {
	        return onlineCount;
	    }

	    public static synchronized void addOnlineCount() {
	    	 MyWebSocket.onlineCount++;
	    }

	    public static synchronized void subOnlineCount() {
	         MyWebSocket.onlineCount--;
	    }

	}
	
	


