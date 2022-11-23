package com.marcusapi.api;

import org.springframework
	.stereotype
	.Repository;



// Importing the items class to
// use the defined properties
// in this class
import com.marcusapi.api.itemStorage;

@Repository

 
// Class to create a list
// of items
public class itemAccess {

	private static itemStorage list
		= new itemStorage();

	// This static block is executed
	// before executing the main
	// block
	static
	{

        list.getItemList().add(new item(1,"First text"));
				 
	}

	// Method to return the list
	public itemStorage getAllItems()
	{
		return list;
	}

	 
		// Method to add an item
		// to the items list
		public void
		addItem(item item)
	{
		list.getItemList()
			.add(item);
		 
	}
}

