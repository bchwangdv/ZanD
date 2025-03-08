package com.bvrg.zand.search.model.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "Player")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	@Id
	private String id; // mongoDB 고유키
	private String spId; // 선수고유번호
	private String salary; // 급여
	private String height; // 키
	private String weight; // 몸무게
}