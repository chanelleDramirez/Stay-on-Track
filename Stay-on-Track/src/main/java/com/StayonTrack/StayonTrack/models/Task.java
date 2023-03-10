package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column (nullable = false, length = 100)
private String title;

    @Column (nullable = false, length = 100)
    private String status;

    @Column (nullable = false)
    private String content;


    public Task(){

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @ManyToOne
    @JoinColumn (name= "user_id")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="task_category",
            joinColumns={@JoinColumn(name="task_id")},
            inverseJoinColumns={@JoinColumn(name="category_id")}
    )
    private List<Category> categories;



    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
