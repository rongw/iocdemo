package com.demo.ioc.experiment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.ioc.experiment.service.config.IConfigService;


@Configuration
@ComponentScan(basePackages={"com.demo.ioc.experiment.service"})
public class Application{
	
	@Autowired
	private IConfigService configService;
	
    public Application(){
    	
    }
    
    public void start(){
    	System.out.println(configService.getClientName());
    }
}
