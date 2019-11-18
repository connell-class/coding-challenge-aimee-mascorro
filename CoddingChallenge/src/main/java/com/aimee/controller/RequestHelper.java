package com.aimee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static String process(HttpServletRequest req, HttpServletResponse resp) throws ClassNotFoundException {

		switch (req.getRequestURI()) {
		case "/reimbursements/html/employee.empl":
			JsonController.sendUsers(req, resp);
			return HomeController.goHome(req);
		case "/reimbursements/login.go":
			return LoginController.login(req);
		case "/reimbursements/user.xml":
			JaxbController.sendCats(req, resp);
		case "/reimbursements/cats.xml":
			JaxbController.sendCats(req, resp);
		case "/reimbursements/employee.html":
			
		case "/reimbursements/user.json":
			JsonController.sendUsers(req, resp);
		default:
			return "login.html";
		}
	}

}

