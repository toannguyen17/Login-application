package app.controller;

import app.dao.UserDao;
import app.model.Login;
import app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(){
		return "redirect:/home";
	}

	@GetMapping("/home")
	public String home(){
		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute Login login, Model model){
		User user = UserDao.checkLogin(login);
		if(user == null){
			return "error";
		} else {
			model.addAttribute("user", user);
			return "user";
		}
	}
}
