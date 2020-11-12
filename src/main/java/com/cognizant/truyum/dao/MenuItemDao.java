package com.cognizant.truyum.dao;

import java.util.List;
import com.cognizant.truyum.model.MenuItem;

public interface MenuItemDao {

	// To get all the menu items in the view of Administrator

	List<MenuItem> getMenuItemListAdmin();

	// To get all the menu items in the view of Customer

	List<MenuItem> getMenuItemListCustomer();

	// To Modify any menu item present in the MenuItemList

	void modifyMenuItem(MenuItem menuItem);

	/**
	 * To return any menu Item from the Menu Item List
	 * 
	 * @param menuItemId
	 * @return {@code MenuItem}
	 */
	MenuItem getMenuItem(long menuItemId);

}