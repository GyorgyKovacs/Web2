package com.webapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp2.DAO.VisitorDao;
import com.webapp2.domain.Visitor;

@Service
public class VisitorService {
	@Autowired
	private VisitorDao visitorDAO;

	public List<Visitor> getVisitors() {
		return visitorDAO.getVisitors();
	}

	public void save(Visitor visitor) {
		visitorDAO.save(visitor);
	}
}
