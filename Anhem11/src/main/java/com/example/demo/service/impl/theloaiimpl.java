package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.theloaidao;
import com.example.demo.entity.theloaientity;
import com.example.demo.service.theloaiservice;
@Service
public class theloaiimpl implements theloaiservice{
	@Autowired
	theloaidao tldao;

	@Override
	public List<theloaientity> findAll() {
		// TODO Auto-generated method stub
		return tldao.findAll();
	}



	@Override
	public theloaientity create(theloaientity TLentity) {
		// TODO Auto-generated method stub
		return tldao.save(TLentity);
	}

	@Override
	public theloaientity update(theloaientity TLentity) {
		// TODO Auto-generated method stub
		return tldao.save(TLentity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 tldao.deleteById(id);
	}

	@Override
	public theloaientity findById(int id) {
		// TODO Auto-generated method stub
		return tldao.findById(id).get();
	}

}
