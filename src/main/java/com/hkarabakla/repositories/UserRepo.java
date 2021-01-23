package com.hkarabakla.repositories;

import com.hkarabakla.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface UserRepo extends CrudRepository<User, Integer> {

    Set<User> findByName(String name);

    Set<User> findAllByNameContainingIgnoreCase(String name);

    Set<User> findAllByIdLessThanAndName(Integer id, String name);
}
