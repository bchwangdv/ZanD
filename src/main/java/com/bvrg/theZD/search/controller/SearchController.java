package com.bvrg.theZD.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bvrg.theZD.search.model.vo.Player;
import com.bvrg.theZD.search.repository.PlayerRepository;

@Controller
public class SearchController {

	@GetMapping("searchResult")
	public String getSearchList(@RequestParam("nickname") String nickname, Model model) {
		int conditionNo = 50; // default 공식경기 검색
		model.addAttribute("conditionNo", conditionNo);
		model.addAttribute("nickname", nickname);
		return "searchResult";
	}
	
	@Autowired
	private PlayerRepository PlayerRepository;
	
    @GetMapping("playerSearchResult")
    public String playerSearchResult(Model model) {
        System.out.println("전체 데이터 출력:");
        PlayerRepository.findAll().forEach();
        PlayerRepository.findByPId("101");
        model.addAttribute("player", player);
        return "playerSearch";
    }
}
