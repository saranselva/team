package com.dhanu.team.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanu.team.model.Team;

@Repository
public class TeamDAO implements ITeamDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @SuppressWarnings("unchecked")

    public List<Team> getTeams() {
       return getCurrentSession().createQuery("from Team").list();
            


    }

    @Override
    public Team addTeam(Team team) {
        
        Integer i = (Integer) getCurrentSession().save(team);
        Team t = (Team) getCurrentSession().get(Team.class, i);
        return t;

        
    }

    @Override
    public Team getTeamId(int id) {
        return (Team) getCurrentSession().get(Team.class, id);
    }

}
