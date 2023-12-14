package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.theloaientity;

@Repository
public interface theloaidao extends JpaRepository<theloaientity, Integer>
{
	
}
