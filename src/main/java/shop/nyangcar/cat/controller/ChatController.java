package shop.nyangcar.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chat")
public class ChatController {
	
	@GetMapping("")
	public String menu() {
		return "main/menu";
	}
	
	@GetMapping("register")
	public String reg() {
		return "main/registered/register";
	}
	
	@GetMapping("register/distance")
	public String dis() {
		return "main/registered/registerDistance";
	}
	
	@GetMapping("register/item")
	public String item() {
		return "main/registered/registerItem";
	}
}
