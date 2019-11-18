package com.aimee.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aimee.models.GroceryItems;

public interface GroceriesDao extends CrudRepository<GroceryItems, Integer> {
	
	GroceryItems findById(int id);
	List<GroceryItems> findAllByTypeLike(String type);
}

