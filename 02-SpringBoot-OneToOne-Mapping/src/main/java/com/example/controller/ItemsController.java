package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Items;
import com.example.service.ItemsService;

@RestController
public class ItemsController {

	@Autowired
	private ItemsService itemsService;
	
	@PostMapping("/saveitems")
	public Items Save(@RequestBody Items items) {
		 itemsService.save(items);
		 return items;
	}
	@PutMapping("/updateitems")
	public Items update(@RequestBody Items items) {
		 itemsService.update(items);
		 return items;
	}
	
	@GetMapping("/findAllItems")
	public List<Items>FindAllItems(){
		return itemsService.findAll();
		
	}

	@GetMapping("/findByItemsid/{id}")
	public int findById(@PathVariable("id") int id) {
		itemsService.FindByid(id);
		return id;

	}

	@DeleteMapping("deletedbyItemsid/{id}")
	public String Deletedbyid(@PathVariable("id") int id) {
		itemsService.DeletedById(id);
		return "Deletedbyid succefully...!" + id;

	}
	 
}
