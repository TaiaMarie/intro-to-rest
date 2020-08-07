package com.stayready.poll_application.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Vote 
{
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long iD;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;


    //getters and setters

    public void setID(Long iD)
    {
        this.iD = iD;
    }

    public void setOption(Option  option)
    {
        this.option = option;
    }

    public Long getID()
    {
        return this.iD;
    }

    public Option getOption()
    {
        return this.option;
    }


}