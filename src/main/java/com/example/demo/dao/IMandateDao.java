package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Mandate;



public interface IMandateDao extends JpaRepository <Mandate, Long>{
	@Query("select m from Mandate m where m.mandateId= ?1")
	List<Mandate> getMandateById(long mandateId);
}
