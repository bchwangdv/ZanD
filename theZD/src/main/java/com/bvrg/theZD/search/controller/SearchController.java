package com.bvrg.theZD.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

	@GetMapping("searchResult")
	public String getSearchList(@RequestParam("nickname") String nickname,
								Model model) {
		
		if(nickname == "") {
			//경고창, redirect
		}
		
		model.addAttribute("nickname", nickname);
		return "searchResult";
	}
}
