package com.aimee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aimee.dao.GroceriesDao;
import com.aimee.models.GroceryItems;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class GroceriesController {

	@Autowired
	GroceriesDao gi;
	
	@PutMapping(value="/saveGroceryItem")
	public @ResponseBody boolean insertBuilding(@RequestBody GroceryItems i) {
		gi.save(i);
		return true;
	}
	
	@GetMapping(value="getAll")
	public @ResponseBody List<GroceryItems> getAllItems(){
		return (List<GroceryItems>)gi.findAll();

	}
	
	
	@PostMapping(value="update")
	public ResponseEntity<GroceryItems> update(@RequestBody GroceryItems i) {
		return new ResponseEntity(gi.save(i),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value="/delete")
	public @ResponseBody GroceryItems delete(@RequestBody GroceryItems i) {
		gi.delete(i);
		return i;
	}
	
	@GetMapping("getById/{id}")
	public ResponseEntity<GroceryItems> getById(@PathVariable("id") int id){
		return new ResponseEntity(gi.findById(id),HttpStatus.OK);
	}
	
}
