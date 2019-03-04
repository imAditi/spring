package com.example.pbapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.pbapp.command.LoginCommand;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/user/dashboard" })
	public String userDashboard() {
		return "user/dashboard_user";
	}

	@RequestMapping(value = {"/admin/dashboard"})
	public String adminDashboard() {
		return "user/dashboard_admin";
	}

	@RequestMapping(value = { "/login" })
	public String login(Model model) {
		model.addAttribute("command", new LoginCommand());
		return "login";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute("command") LoginCommand loginCommand, Model model, HttpSession session) {

		try {
			User loggedInUser = userService.login(loginCommand.getLoginname(), loginCommand.getPassword());
			// success
			if (loggedInUser != null) {
				if (loggedInUser.getRole().equals(userService.ROLE_ADMIN)) {
					setLoggedInUserSession(session, loggedInUser);
					return "redirect:admin/dashboard";
				} else if (loggedInUser.getRole().equals(userService.ROLE_USER)) {
					setLoggedInUserSession(session, loggedInUser);
					return "redirect:user/dashboard";
				} else {
					model.addAttribute("err", "invalid role!");
					return "login";
				}
			}
			// failed
			else {
				model.addAttribute("err", "invalid user! check your credentials.");
				return "login";
			}

		} catch (BlockUserException e) {
			model.addAttribute("err", e.getMessage());
			return "login";
		}

	}

	@RequestMapping(value = { "/registration" })
	public String registration() {
		return "registration";
	}

	private void setLoggedInUserSession(HttpSession session, User loggedInUser) {
		session.setAttribute("loggedInUser", loggedInUser);
		session.setAttribute("name", loggedInUser.getName());
		session.setAttribute("role", loggedInUser.getRole());
	}
}
