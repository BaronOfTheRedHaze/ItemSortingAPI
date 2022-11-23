package com.marcusapi.api;

import java.util.ArrayList;
import java.util.List;

// Class to store the list of
// all the items in an
// Array List
public class itemStorage {

	private List<item> itemList;

	// Method to return the list
	// of items
	public List<item> getItemList()
	{

		if (itemList == null) {

			itemList
				= new ArrayList<>();
		   
		}

		return itemList;
		 
	}

	public void
	setItemList(
		List<item> itemList)
	{
		this.itemList
			= itemList;
	}
}
