package com.tianma.BI_Process.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
//	@Autowired
//	private  JavaMailSender mailSender;
//	
//	@Value("${spring.mail.username}") //发送人的邮箱
//	private String fromEmail;
//	
//	@Async
//	public void sendMail(String title, String url, String email) {
//		SimpleMailMessage message = new SimpleMailMessage();
//	    message.setFrom(fromEmail); // 发送人的邮箱
//	    message.setSubject(title); //标题
//	    message.setTo(email); //发给谁  对方邮箱
//	    message.setText(url); //内容
//	    mailSender.send(message); //发送
//	}
    
}
