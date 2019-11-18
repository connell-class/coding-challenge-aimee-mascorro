package com.aimee.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aimee.models.GroceryItems;

public class GroceriesDao implements DataAccess {
	
	static {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

		public static List<GroceryItems> getItembyType(String itemName) throws ClassNotFoundException {
			
			try {
				
				Connection conn = DriverManager.getConnection(URL, username, password);
			//	String sql = "select * from users where username  = ? and password = md5(?||?||'cat');";
				String sql = "select itemdescription from \"shoppingitems\" where shoppinglistid = ?;";
				System.out.println("User Dao Called");
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, itemName);
				
				List<GroceryItems> gItems = null;
				ResultSet rs = ps.executeQuery();
				GroceryItems i=null;
				
				while(rs.next()) {
					i = new GroceryItems(0, rs.getString(1), rs.getString(2));
					gItems.add(i);
				
				}
				System.out.println(i);
				return gItems;
	
			} catch (SQLException e) {

				e.printStackTrace();
			}
			System.out.println("dao returning null");
			return null;
		}
		
		   public List<GroceryItems> getAllItems(int shoppingList) {
		        try {
		            Connection conn = DriverManager.getConnection(URL, username, password);
		            String sql = "select itemdescription from \"shoppingitems\" where shoppinglistid = '?';";
		            Statement s = conn.createStatement();
		            List<GroceryItems> allItems = new ArrayList<GroceryItems>();
		            ResultSet rs = s.executeQuery(sql);
		            while (rs.next()) {
		            	GroceryItems i = new GroceryItems(0, rs.getString(1), rs.getString(2));
						allItems.add(i);
		            }
		            s.close();
		            conn.close();
		            return allItems;
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return null;
		    }

		public void addItem(GroceryItems i) {


			try (Connection conn = DriverManager.getConnection(URL, username, password)) {
			
				String sql = "insert into shoppingitems (\"itemtype\", \"itemdescription\", \"shoppinglistid\") values ('?', '?', ? );";
				PreparedStatement ps = conn.prepareStatement(sql);
/*				ps.setString(1, i.getUserName());
				ps.setString(2, i.getUserPassword());
				ps.setInt(3, i.getUserRole());*/
				int x = ps.executeUpdate();
				
			} catch (SQLException e) {

			}
		
		}
}
