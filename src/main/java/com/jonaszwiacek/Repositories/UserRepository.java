package com.jonaszwiacek.Repositories;

import com.jonaszwiacek.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);

    User findByUsername(String username);

}
