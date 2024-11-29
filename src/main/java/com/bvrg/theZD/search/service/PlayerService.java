package com.bvrg.theZD.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvrg.theZD.search.model.vo.Player;
import com.bvrg.theZD.search.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository PlayerRepository;

    public Player getPlayerBySpId(String spId) {
        return PlayerRepository.findByPId(spId);
    }
}