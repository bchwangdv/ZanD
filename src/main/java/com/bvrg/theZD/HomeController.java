package com.bvrg.theZD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value={"/","main"})
	public String main() {
		return "main";
	}
	@GetMapping("playerSearch")
	public String playerSearch() {
		return "playerSearch";
	}
}
