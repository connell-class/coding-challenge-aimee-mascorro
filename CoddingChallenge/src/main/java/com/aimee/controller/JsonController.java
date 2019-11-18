package com.aimee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reimbursements.data.UserDao;
import com.reimbursementsl.model.JaxbUserWrapper;
import com.reimbursementsl.model.User;


public class JsonController {


		public static void sendUsers(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException {
			UserDao au = new UserDao();
		try {
	
		ObjectMapper om = new ObjectMapper();
	    
			res.getWriter().write(om.writeValueAsString(au.getAllUsers()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


