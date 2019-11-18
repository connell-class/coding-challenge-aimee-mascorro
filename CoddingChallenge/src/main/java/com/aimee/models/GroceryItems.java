package com.aimee.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GroceryItems {
	
	private int itemId;
	private String itemName;
	private String itemType;
	private int listId;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
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
		GroceryItems other = (GroceryItems) obj;
		if (itemId != other.itemId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		return true;
	}
	public GroceryItems(int itemId, String itemName, String itemType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
	}
	public GroceryItems() {
		super();
	}
	@Override
	public String toString() {
		return "GroceryItems [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + "]";
	}
	
	

}

