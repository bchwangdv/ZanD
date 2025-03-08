package com.bvrg.zand.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvrg.zand.search.model.vo.Player;
import com.bvrg.zand.search.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository PlayerRepository;

    public Player getPlayerBySpId(String spId) {
        return PlayerRepository.findBySpId(spId);
    }
}