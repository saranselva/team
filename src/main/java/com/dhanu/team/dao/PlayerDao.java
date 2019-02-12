package com.dhanu.team.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanu.team.model.Player;

@Repository
public class PlayerDao implements IPlayerDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @SuppressWarnings("unchecked")

    public List<Player> getPlayers() {
        return getCurrentSession().createQuery("from Player").list();
    }

    @Override
    public Player addPlayer(Player player) {
        Integer i = (Integer) getCurrentSession().save(player);
        Player t = (Player) getCurrentSession().get(Player.class, i);
        return t;

    }

    @Override
    public Player getPlayerId(int id) {
        return (Player) getCurrentSession().get(Player.class, id);
    }

}
