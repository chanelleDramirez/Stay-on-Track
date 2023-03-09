package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="associative")
public class Associative {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="associative",
            joinColumns={@JoinColumn(name="tasks_id")},
            inverseJoinColumns={@JoinColumn(name="categories_id")}
    )
    private List<Associative> associative;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
