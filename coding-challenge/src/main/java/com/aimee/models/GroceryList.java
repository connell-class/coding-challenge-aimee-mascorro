
package com.aimee.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroceryList {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Autowired
	private List<GroceryItems> shoppinglist;
	
	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", shoppinglist=" + shoppinglist + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<GroceryItems> getShoppinglist() {
		return shoppinglist;
	}
	public void setShoppinglist(List<GroceryItems> shoppinglist) {
		this.shoppinglist = shoppinglist;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((shoppinglist == null) ? 0 : shoppinglist.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (id != other.id)
			return false;
		if (shoppinglist == null) {
			if (other.shoppinglist != null)
				return false;
		} else if (!shoppinglist.equals(other.shoppinglist))
			return false;
		return true;
	}
	public GroceryList(int id, List<GroceryItems> shoppinglist) {
		super();
		this.id = id;
		this.shoppinglist = shoppinglist;
	}
	public GroceryList() {
		super();
	}
	
	
	
}
