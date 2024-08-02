package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.dao.UserDao;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String email, @RequestParam("userName") String userName,
//			@RequestParam("password") String password, Model model) {
//		System.out.println("user email " + email);
//		System.out.println("user username " + userName);
//		System.out.println("user password " + password);
//		model.addAttribute("email", email);
//		model.addAttribute("username", userName);
//		model.addAttribute("password", password);
//		return "sucess"; 
//	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getUserName());
		this.userService.createUser(user);
		return "sucess"; 
	}
	
}
