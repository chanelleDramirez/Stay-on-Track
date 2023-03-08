package com.StayonTrack.StayonTrack.models;


import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column
private String title;

    @Column
    private String status;

    @Column
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


}
