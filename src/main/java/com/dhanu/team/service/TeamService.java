package com.dhanu.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhanu.team.dao.ITeamDao;
import com.dhanu.team.model.Team;

@Service
@Transactional
public class TeamService implements ITeamService {
    @Autowired
    private ITeamDao teamDao;

    @Override
    public List<Team> getTeams() {

        return teamDao.getTeams();
    }

    @Override
    public Team addTeam(Team team) {
        return teamDao.addTeam(team);

    }

    @Override
    public Team getTeamId(int id) {
        // TODO Auto-generated method stub
        return teamDao.getTeamId(id);
    }

}
