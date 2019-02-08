package com.dhanu.team.service;

import java.util.List;

import com.dhanu.team.model.Team;

public interface ITeamService {
    public List<Team> getTeams();
    public Team addTeam(Team team);
    public Team getTeamId(int id);

    

}
