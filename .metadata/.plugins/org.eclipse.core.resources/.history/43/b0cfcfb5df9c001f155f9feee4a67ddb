package com.bvrg.theZD.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

	@GetMapping("searchResult")
	public String getSearchList(
								@RequestParam("nickname") String nickname,
								Model model) {
		int conditionNo = 50; // default 공식경기 검색
		
		model.addAttribute("conditionNo", conditionNo);
		model.addAttribute("nickname", nickname);
		return "searchResult";
	}
}
