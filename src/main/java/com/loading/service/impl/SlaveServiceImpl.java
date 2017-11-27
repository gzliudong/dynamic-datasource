package com.loading.service.impl;

import org.springframework.stereotype.Service;

import com.loading.commons.annotation.DataSourceChange;
import com.loading.service.SlaveService;

@Service
public class SlaveServiceImpl implements SlaveService {

	//private SlaveMapper slaveMapper;
	
	//@Override
    @DataSourceChange(slave = true)
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
    @DataSourceChange(slave = true)
	public Integer count2() {
		// TODO Auto-generated method stub
		return null;
	}

}
