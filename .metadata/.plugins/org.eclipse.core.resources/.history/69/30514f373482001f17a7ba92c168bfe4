package com.bvrg.theZD.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

	@GetMapping("searchResult")
	public String getSearchList(@RequestParam("searchCondition") String searchCondition,
								@RequestParam("nickname") String nickname,
								Model model) {
		int conditionNo = 0;
		if(nickname == "") {
			//경고창, redirect
		} else if (searchCondition.equals("officialMatch")) {
			conditionNo = 50;
		} else if (searchCondition.equals("classic1on1")) {
			conditionNo = 40;
		} else if (searchCondition.equals("managerMode")) {
			conditionNo = 52;
		}
		
		model.addAttribute("conditionNo", conditionNo);
		model.addAttribute("nickname", nickname);
		return "searchResult";
	}
}
