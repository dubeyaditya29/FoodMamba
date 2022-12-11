package com.foodMamba.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.mysql.cj.xdevapi.Statement;

public class FoodMambaDBUtil {
	
	public static List<FoodList> getFoodList() throws ClassNotFoundException, SQLException {
		
		
		ArrayList<FoodList> list_of_foods = new ArrayList<>();
		
		// Define the Connection URL
		
		String url = "jdbc:mysql://localhost:3306/sys";
		//sys is the schema name here!
		String username = "root";
		String password = "Aditya@123";
		
		
		
		//load the MySql Driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Got the driver");
		
		//Get the connection
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection Established!");
		//Create the statement
		
		java.sql.Statement statement = connection.createStatement();
		
		System.out.println("Statement created!");
		//Execute the statement
		
		ResultSet resultSet = statement.executeQuery("Select * from foodlist");
		
		System.out.println("Statement executed!");
		while(resultSet.next()) {
			
			int id = resultSet.getInt(1);
			String itemName = resultSet.getString(2);
			int itemPrice = resultSet.getInt(3);
			
			FoodList foodList = new FoodList(id, itemName, itemPrice);
			list_of_foods.add(foodList);
			System.out.println("items added to list_of_foods");
			
		}
		
		return list_of_foods;
	}

}
