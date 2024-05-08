package com.Feedback_GvuiTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {
	private static final String Https = null;
	@Autowired
	private UserService userService;
	
	@GetMapping("/form")
	public String form()
	{
		return "form";
	}
	
	
	
	@PostMapping("/addFeedBacks")
	@ResponseStatus(HttpStatus.CREATED)
	public String addFeedBacks(@ModelAttribute("user") User user,Model m)
	{
		userService.addFeedBacks(user);
		return "result";
	}
}
