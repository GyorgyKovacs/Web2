package com.webapp2.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp2.domain.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
	@Override
	List<Visitor> findAll();
}
