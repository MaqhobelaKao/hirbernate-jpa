package com.maqhobela.hibernatedemo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Entity
public class Location {
    @Id
    private Integer id;
    String name;

    @OneToMany(mappedBy = "location")
    private List<User> users;

    public Location() {
    }

    public Location(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @JsonManagedReference
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
