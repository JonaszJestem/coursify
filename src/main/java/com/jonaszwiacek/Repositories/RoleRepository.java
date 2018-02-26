package com.jonaszwiacek.Repositories;

import com.jonaszwiacek.Model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
