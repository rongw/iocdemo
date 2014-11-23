package com.demo.ioc.experiment.service.config.hilton.impl;

import org.springframework.stereotype.Service;

import com.demo.ioc.experiment.service.config.IConfigService;

@Service
public class HiltonConfigServiceImpl implements IConfigService{

	public String getClientName() {
		
		return "hilton";
	}

}
