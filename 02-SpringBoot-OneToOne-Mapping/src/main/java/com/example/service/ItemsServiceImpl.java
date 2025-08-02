package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Items;
import com.example.repository.ItemsRepository;

@Service
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	private ItemsRepository itemsRepository;

	@Override
	public void save(Items items) {
		itemsRepository.save(items);	
	}

	@Override
	public void update(Items items) {
		itemsRepository.save(items);	
		
	}

	@Override
	public Items FindByid(int id) {
		return itemsRepository.findById(id).get();
	}

	@Override
	public List<Items> findAll() {
		return itemsRepository.findAll();
	}

	@Override
	public void DeletedById(int id) {
		itemsRepository.findById(id);
		
	}

}
