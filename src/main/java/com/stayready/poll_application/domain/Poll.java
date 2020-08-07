package com.stayready.poll_application.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

public class Poll
{
    //@Entity
    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long iD;

    @Column(name = "POLL_QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set < Option > options;


    //getters and setters

    public void setID(Long iD)
    {
        this.iD = iD;
    }

    public void setValue(String question)
    {
        this.question = question;
    }

    public void setOptions(Set < Option > options)
    {
        this.options = options;
    }

    public Long getID()
    {
        return this.iD;
    }

    public String getQuestion()
    {
        return this.question;
    }

    public Set < Option >  getOptions()
    {
        return this.options;
    }




}