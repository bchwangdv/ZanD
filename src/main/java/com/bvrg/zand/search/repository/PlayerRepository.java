package com.bvrg.zand.search.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bvrg.zand.search.model.vo.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
	Player findBySpId(String spId);
	Player findBySalary(String Salary);
}
