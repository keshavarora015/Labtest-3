package com.tmgt.model.service;

import java.util.List;

import com.tmgt.model.dao.Traniee;
import com.tmgt.model.dao.TranieeDao;
import com.tmgt.model.dao.TranieeDaoImpl;

public class TranieeServiceImpl implements TranieeService {

	private TranieeDao tranieeDao;
	
	
	public TranieeServiceImpl() {
		tranieeDao=new TranieeDaoImpl();
	}

	@Override
	public void addTraniee(Traniee traniee) {
		tranieeDao.addTraniee(traniee);
		
	}

	@Override
	public List<Traniee> getAllTraniee() {
		return tranieeDao.getAllTraniee();
	}

}
