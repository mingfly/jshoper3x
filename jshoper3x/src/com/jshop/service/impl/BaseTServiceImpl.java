package com.jshop.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jshop.dao.BaseTDao;
import com.jshop.service.BaseTService;

@Service("baseTService")
@Scope("prototype")
public class BaseTServiceImpl<T> implements BaseTService<T>{
	@Resource
	private BaseTDao<T> baseTDao;
	
	public BaseTDao<T> getBaseTDao() {
		return baseTDao;
	}

	public void setBaseTDao(BaseTDao<T> baseTDao) {
		this.baseTDao = baseTDao;
	}

	@Override
	public void save(T t) {
		this.getBaseTDao().save(t);
	}

}
