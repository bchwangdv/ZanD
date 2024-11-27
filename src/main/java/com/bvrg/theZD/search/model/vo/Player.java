package com.bvrg.theZD.search.model.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Players.Player")
public class Player {
	@Id
	private String salary; // 급여
	private String height; // 키
	private String weight; // 몸무게
	private String interceptions; // 가로채기
	private String sprintspeed; // 속력
	private String acceleration; // 가속력
	private String finishing; // 골 결정력
	private String longpassing; // 긴 패스
	private String marking; // 대인 수비
	private String dribbling; // 드리블
	private String strength; // 몸싸움
	private String agility; // 민첩성
	private String reactions; // 반응 속도
	private String volleys; // 발리 슛
	private String balance; // 밸런스
	private String ballcontrol; // 볼 컨트롤
	private String shotpower; // 슛 파워
	private String stamina; // 스태미너
	private String slidingtackle; // 슬라이딩 태클
	private String vision; // 시야
	private String positioning; // 위치 선정
	private String aggression; // 적극성
	private String jumping; // 점프
	private String longshots; // 중거리 슛
	private String shortpassing; // 짧은 패스
	private String composure; // 침착성
	private String curve; // 커브
	private String crossing; // 크로스
	private String standingtackle; // 태클
	private String penalties; // 페널티 킥
	private String freekickaccuracy; // 프리킥
	private String headingaccuracy; // 헤더
	private String gkdiving; // GK 다이빙
	private String gkreflexes; // GK 반응속도
	private String gkkicking; // GK 킥
	private String gkhandling; // GK 핸들링
	
	
	public Player(String salary, String height, String weight, String interceptions, String sprintspeed,
			String acceleration, String finishing, String longpassing, String marking, String dribbling,
			String strength, String agility, String reactions, String volleys, String balance, String ballcontrol,
			String shotpower, String stamina, String slidingtackle, String vision, String positioning,
			String aggression, String jumping, String longshots, String shortpassing, String composure, String curve,
			String crossing, String standingtackle, String penalties, String freekickaccuracy, String headingaccuracy,
			String gkdiving, String gkreflexes, String gkkicking, String gkhandling) {
		super();
		this.salary = salary;
		this.height = height;
		this.weight = weight;
		this.interceptions = interceptions;
		this.sprintspeed = sprintspeed;
		this.acceleration = acceleration;
		this.finishing = finishing;
		this.longpassing = longpassing;
		this.marking = marking;
		this.dribbling = dribbling;
		this.strength = strength;
		this.agility = agility;
		this.reactions = reactions;
		this.volleys = volleys;
		this.balance = balance;
		this.ballcontrol = ballcontrol;
		this.shotpower = shotpower;
		this.stamina = stamina;
		this.slidingtackle = slidingtackle;
		this.vision = vision;
		this.positioning = positioning;
		this.aggression = aggression;
		this.jumping = jumping;
		this.longshots = longshots;
		this.shortpassing = shortpassing;
		this.composure = composure;
		this.curve = curve;
		this.crossing = crossing;
		this.standingtackle = standingtackle;
		this.penalties = penalties;
		this.freekickaccuracy = freekickaccuracy;
		this.headingaccuracy = headingaccuracy;
		this.gkdiving = gkdiving;
		this.gkreflexes = gkreflexes;
		this.gkkicking = gkkicking;
		this.gkhandling = gkhandling;
	}
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(String interceptions) {
		this.interceptions = interceptions;
	}
	public String getSprintspeed() {
		return sprintspeed;
	}
	public void setSprintspeed(String sprintspeed) {
		this.sprintspeed = sprintspeed;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getFinishing() {
		return finishing;
	}
	public void setFinishing(String finishing) {
		this.finishing = finishing;
	}
	public String getLongpassing() {
		return longpassing;
	}
	public void setLongpassing(String longpassing) {
		this.longpassing = longpassing;
	}
	public String getMarking() {
		return marking;
	}
	public void setMarking(String marking) {
		this.marking = marking;
	}
	public String getDribbling() {
		return dribbling;
	}
	public void setDribbling(String dribbling) {
		this.dribbling = dribbling;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getAgility() {
		return agility;
	}
	public void setAgility(String agility) {
		this.agility = agility;
	}
	public String getReactions() {
		return reactions;
	}
	public void setReactions(String reactions) {
		this.reactions = reactions;
	}
	public String getVolleys() {
		return volleys;
	}
	public void setVolleys(String volleys) {
		this.volleys = volleys;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBallcontrol() {
		return ballcontrol;
	}
	public void setBallcontrol(String ballcontrol) {
		this.ballcontrol = ballcontrol;
	}
	public String getShotpower() {
		return shotpower;
	}
	public void setShotpower(String shotpower) {
		this.shotpower = shotpower;
	}
	public String getStamina() {
		return stamina;
	}
	public void setStamina(String stamina) {
		this.stamina = stamina;
	}
	public String getSlidingtackle() {
		return slidingtackle;
	}
	public void setSlidingtackle(String slidingtackle) {
		this.slidingtackle = slidingtackle;
	}
	public String getVision() {
		return vision;
	}
	public void setVision(String vision) {
		this.vision = vision;
	}
	public String getPositioning() {
		return positioning;
	}
	public void setPositioning(String positioning) {
		this.positioning = positioning;
	}
	public String getAggression() {
		return aggression;
	}
	public void setAggression(String aggression) {
		this.aggression = aggression;
	}
	public String getJumping() {
		return jumping;
	}
	public void setJumping(String jumping) {
		this.jumping = jumping;
	}
	public String getLongshots() {
		return longshots;
	}
	public void setLongshots(String longshots) {
		this.longshots = longshots;
	}
	public String getShortpassing() {
		return shortpassing;
	}
	public void setShortpassing(String shortpassing) {
		this.shortpassing = shortpassing;
	}
	public String getComposure() {
		return composure;
	}
	public void setComposure(String composure) {
		this.composure = composure;
	}
	public String getCurve() {
		return curve;
	}
	public void setCurve(String curve) {
		this.curve = curve;
	}
	public String getCrossing() {
		return crossing;
	}
	public void setCrossing(String crossing) {
		this.crossing = crossing;
	}
	public String getStandingtackle() {
		return standingtackle;
	}
	public void setStandingtackle(String standingtackle) {
		this.standingtackle = standingtackle;
	}
	public String getPenalties() {
		return penalties;
	}
	public void setPenalties(String penalties) {
		this.penalties = penalties;
	}
	public String getFreekickaccuracy() {
		return freekickaccuracy;
	}
	public void setFreekickaccuracy(String freekickaccuracy) {
		this.freekickaccuracy = freekickaccuracy;
	}
	public String getHeadingaccuracy() {
		return headingaccuracy;
	}
	public void setHeadingaccuracy(String headingaccuracy) {
		this.headingaccuracy = headingaccuracy;
	}
	public String getGkdiving() {
		return gkdiving;
	}
	public void setGkdiving(String gkdiving) {
		this.gkdiving = gkdiving;
	}
	public String getGkreflexes() {
		return gkreflexes;
	}
	public void setGkreflexes(String gkreflexes) {
		this.gkreflexes = gkreflexes;
	}
	public String getGkkicking() {
		return gkkicking;
	}
	public void setGkkicking(String gkkicking) {
		this.gkkicking = gkkicking;
	}
	public String getGkhandling() {
		return gkhandling;
	}
	public void setGkhandling(String gkhandling) {
		this.gkhandling = gkhandling;
	}
}
