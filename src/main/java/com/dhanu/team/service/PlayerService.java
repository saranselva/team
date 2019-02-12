package com.dhanu.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhanu.team.dao.IPlayerDao;
import com.dhanu.team.model.Player;
@Service
@Transactional
public class PlayerService implements IPlayerService {
    
    @Autowired
    private IPlayerDao playerDao;

    @Override
    public List<Player> getPlayers() {
        return playerDao.getPlayers();
    }

    @Override
    public Player addPlayer(Player player) {
        return playerDao.addPlayer(player);
    }

    @Override
    public Player getPlayerId(int id) {
        return playerDao.getPlayerId(id);
    }


}
