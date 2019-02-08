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

import com.dhanu.team.model.Team;
import com.dhanu.team.service.ITeamService;

@RestController
@RequestMapping(value = "teams")
public class TeamController {
    @Autowired
    private ITeamService teamService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Team> getTeams() { // have to list the teams.
        return teamService.getTeams();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Team addTeams(@RequestBody Team t) { // have to add the team details
        return teamService.addTeam(t);

    }
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Team getTeamId(@PathVariable int id) { // have to get the team details by id.
        return teamService.getTeamId(id);

    }

    
    

}
