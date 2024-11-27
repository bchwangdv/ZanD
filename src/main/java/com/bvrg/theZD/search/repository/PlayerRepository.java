package com.bvrg.theZD.search.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.bvrg.theZD.search.model.vo.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
