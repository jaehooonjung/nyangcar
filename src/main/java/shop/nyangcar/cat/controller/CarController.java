package shop.nyangcar.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("car")
public class CarController {
	
	@GetMapping("nothave")
	public String nothave() {
		return "car/nothave";
	}
	
	@GetMapping("new/process/1")
	public String process1() {
		return "car/newProcess1";
	}
	
	@GetMapping("new/process/2")
	public String process2() {
		return "car/newProcess2";
	}
	
	@GetMapping("new/process/3")
	public String process3() {
		return "car/newProcess3";
	}
	
	@GetMapping("new/process/4")
	public String process4() {
		return "car/newProcess4";
	}
	
	@GetMapping("new/confirm")
	public String confirm() {
		return "car/newConfirm";
	}
}
