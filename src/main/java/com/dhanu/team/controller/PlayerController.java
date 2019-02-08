package com.dhanu.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhanu.team.model.Player;
import com.dhanu.team.service.IPlayerService;

@RestController
@RequestMapping(value="players")
public class PlayerController {
    @Autowired
    private IPlayerService playerService;
    
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Player> getPlayer() { // have to list the players.
        return playerService.getPlayers();
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player addPlayers(@RequestBody Player p) { // have to add the player details
        return playerService.addPlayer(p);

    }
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Player getTeamId(@PathVariable int id) { // have to get the player details by id.
        return playerService.getPlayerId(id);

    }


    

}
