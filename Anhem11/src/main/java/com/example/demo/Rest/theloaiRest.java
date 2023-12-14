package com.example.demo.Rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.theloaientity;
import com.example.demo.service.theloaiservice;

@CrossOrigin("*")
@RestController
public class theloaiRest 
{
	@Autowired
	theloaiservice TLService;
	
	@GetMapping("/rest/theloai")
	public ResponseEntity<Collection<theloaientity>> getALL(Model model)
	{
		return ResponseEntity.ok(TLService.findAll());
	}
	
	@GetMapping("/rest/theloai/{id}")
	public ResponseEntity<theloaientity> getById(@PathVariable("id") int id)
	{
		return ResponseEntity.ok(TLService.findById(id));
	}
	@PostMapping("/rest/theloai/create")
	public ResponseEntity<theloaientity>post(@RequestBody theloaientity TheLoaiEntity) throws Exception
	{
		TLService.create(TheLoaiEntity);
		return ResponseEntity.ok(TheLoaiEntity);
	}
	@DeleteMapping("/rest/theloai/delete/{id}")
	public ResponseEntity<Void> delete (@PathVariable("id")int id)
	{
		TLService.delete(id);
		return ResponseEntity.ok().build();

	}
	
}
