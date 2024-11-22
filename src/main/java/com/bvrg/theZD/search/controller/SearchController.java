package com.bvrg.theZD.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


@Controller
public class SearchController {

	@GetMapping("searchResult")
	public String getSearchList(@RequestParam("nickname") String nickname, Model model) {
		int conditionNo = 50; // default 공식경기 검색
		model.addAttribute("conditionNo", conditionNo);
		model.addAttribute("nickname", nickname);
		return "searchResult";
	}
	
	@GetMapping("playerSearchResult")
	public String getPlayersDB() {
		Document doc;
		try {
			doc = Jsoup.connect("https://https://fconline.nexon.com/datacenter/").get();
			System.out.println(doc.title());
			Elements playerInfos = doc.select(".player_info");
			for (Element playerInfo : playerInfos) {
				System.out.println(playerInfo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "playerSearch";
	}
}
