package com.bvrg.zand.search.controller;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bvrg.zand.search.model.vo.Player;
import com.bvrg.zand.search.repository.PlayerRepository;

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
		List<Player> player = PlayerRepository.findAll();
		System.out.println("전체 데이터 출력:" + player);
		model.addAttribute("player", player);
		return "playerSearch";
    }
    
    @GetMapping("playersDBSave")
    @ResponseBody
    public void playersDBSave() {
    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    		
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--headless");
    		
    		WebDriver driver = new ChromeDriver(options);
    		String baseUrl = "https://fifaonline4.inven.co.kr/dataninfo/player/";
    		driver.get(baseUrl);
    		
    		List<WebElement> playerElements = driver.findElements(By.cssSelector(".fifa4.name > b"));
            for (WebElement player : playerElements) {
            }
    		driver.quit();
    }
}
