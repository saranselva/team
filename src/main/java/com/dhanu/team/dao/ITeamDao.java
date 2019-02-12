package com.dhanu.team.dao;

import java.util.List;

import com.dhanu.team.model.Team;

public interface ITeamDao {
    public List<Team> getTeams();
    public Team addTeam(Team team);
    public Team getTeamId(int id);


}
