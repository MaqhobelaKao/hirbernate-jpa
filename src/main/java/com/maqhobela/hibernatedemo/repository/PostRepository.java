package com.maqhobela.hibernatedemo.repository;

import com.maqhobela.hibernatedemo.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
