package com.tianma.BI_Process;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@MapperScan("com.tianma.BI_Process.Repository")
public class App extends 	SpringBootServletInitializer
{
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(App.class);
//	}
//	@Bean    
//	 public ErrorPageFilter errorPageFilter() {   
//	      return new ErrorPageFilter();   
//	 }    
//	@Bean
//	public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {        
//	      FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();           
//	      filterRegistrationBean.setFilter(filter);      
//	      filterRegistrationBean.setEnabled(false);      
//	      return filterRegistrationBean;  
//	}
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
