package com.dhanu.team.dao;

import java.util.List;

import com.dhanu.team.model.Player;

public interface IPlayerDao {
    
    public List<Player> getPlayers();
    public Player addPlayer(Player player);
    public Player getPlayerId(int id);

    

}
