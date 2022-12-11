package com.foodMamba.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.foodMamba.Model.FoodMambaDBUtil;
import com.foodMamba.Model.FoodList;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodCart
 */
@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1. Get data from DB 
		
		try {
			 List<FoodList> foodItems = FoodMambaDBUtil.getFoodList();
			 //request.setAttribute("foodItems",foodItems);

			 request.setAttribute("foodItems", foodItems);
			 System.out.println("Added to FE");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. redirect to a view.
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_food.jsp");
		
		requestDispatcher.forward(request, response);
		
		
	}

}
