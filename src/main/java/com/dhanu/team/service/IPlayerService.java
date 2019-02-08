package com.dhanu.team.service;

import java.util.List;

import com.dhanu.team.model.Player;

public interface IPlayerService {
    
    public List<Player> getPlayers();
    public Player addPlayer(Player player);
    public Player getPlayerId(int id);

    

}
