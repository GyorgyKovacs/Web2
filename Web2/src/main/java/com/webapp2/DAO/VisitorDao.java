package com.webapp2.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webapp2.domain.Visitor;

@Component
public class VisitorDao {

	@Autowired
	private VisitorRepository repo;

	public List<Visitor> getVisitors() {
		return repo.findAll();
	}

	public void save(Visitor visitor) {
		repo.save(visitor);
	}
}
