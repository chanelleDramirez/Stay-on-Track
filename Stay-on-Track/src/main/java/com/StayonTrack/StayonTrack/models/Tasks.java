package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column (nullable = false, length = 100)
private String title;

    @Column (nullable = false, length = 100)
    private String status;

    @Column (nullable = false)
    private String content;


    public Tasks(){

    }


    public Tasks(Tasks copy){
        id = copy.id;
        title = copy.title ;
        status = copy.status;
        content = copy.content;

    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
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

@ManyToOne
@JoinColumn(name="categories_id")
    private Categories categories;

    public void setCategories(Categories  categories) {
        this. categories =  categories;
    }

    public Categories getCategories() {
        return  categories;
    }
}
