package com.maqhobela.hibernatedemo.service;

import com.maqhobela.hibernatedemo.model.User;
import com.maqhobela.hibernatedemo.repository.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }


    public Optional<User> getUser(Integer id){
        return userRepository.findById(id);
    }
}
