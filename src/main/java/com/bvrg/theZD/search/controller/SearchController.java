package com.bvrg.theZD.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	private PlayerRepository playerRepository;
	
    @GetMapping("playerSearchResult")
    public String playerSearchResult(Model model) {
    	
        List<Player> players = playerRepository.findAll();
        
        System.out.println("players:" + players);
        model.addAttribute("players", players);
    	
        return "playerSearch";
    }
	
	
	
// 크롤링
//	@GetMapping("playerSearchResult")
//	public String playerSearchResult() {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		
//		WebDriver driver = new ChromeDriver(options);
//		String baseUrl = "https://fifaonline4.inven.co.kr/dataninfo/player/";
//		driver.get(baseUrl);
//		
//		List<WebElement> playerElements = driver.findElements(By.cssSelector(".fifa4.name > b"));
//        for (WebElement player : playerElements) {
//            System.out.println(player.getText());
//        }
//		
//		driver.quit();
//		return "playerSearch";
//	}
}
