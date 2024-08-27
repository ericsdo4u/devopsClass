package com.semicolon.devopsclass.data.repositories;

import com.semicolon.devopsclass.data.model.User;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, Long> {
    boolean existsById(long id);

    void save(User user);
}
