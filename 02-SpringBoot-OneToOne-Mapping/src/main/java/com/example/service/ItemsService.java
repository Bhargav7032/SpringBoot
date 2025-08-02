package com.example.service;

import java.util.List;

import com.example.entity.Customer;
import com.example.entity.Items;

public interface ItemsService {
	
	public void save(Items items);

	public void update(Items items);

	public Items FindByid(int id);

	public List<Items> findAll();

	public void DeletedById(int id);
	

}
