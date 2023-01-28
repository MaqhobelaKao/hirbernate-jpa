package com.maqhobela.hibernatedemo.repository;

import com.maqhobela.hibernatedemo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
