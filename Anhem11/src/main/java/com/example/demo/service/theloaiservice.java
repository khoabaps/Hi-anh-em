package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.theloaientity;
@Service
public interface theloaiservice 
{
	public List<theloaientity> findAll();
	public theloaientity findById(int id);
	public theloaientity create(theloaientity TLentity);
	public theloaientity update(theloaientity TLentity);
	public void delete(int id);
	
}
