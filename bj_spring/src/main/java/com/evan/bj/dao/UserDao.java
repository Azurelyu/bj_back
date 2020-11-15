package com.evan.bj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername (String username);

    User getByUsernameAndPassword (String name,String password);
}
