package com.aimee.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aimee.controller.RequestHelper;

public class MasterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
		//	req.getRequestDispatcher(RequestHelper.process(req)).forward(req, resp);
			RequestHelper.process(req, resp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			System.out.println("Master Servlet Called");
			req.getRequestDispatcher(RequestHelper.process(req, resp)).forward(req, resp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
