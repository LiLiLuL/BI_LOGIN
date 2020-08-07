package com.tianma.BI_Process.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(String a) {
		return "hello world121212"+a;
	}
}
