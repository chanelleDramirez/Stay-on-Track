package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String name;


    public Category(){

    }


    public Category(Category copy){
        id = copy.id;
        name = copy.name;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToMany(mappedBy = "categories")
    private List<Task> tasks;

}
