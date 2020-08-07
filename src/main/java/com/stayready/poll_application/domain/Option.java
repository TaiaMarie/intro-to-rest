package com.stayready.poll_application.domain;

import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Option
{   
    //@Entity
    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long iD;

    @Column(name = "OPTION_VALUE")
    private String value;

    //getters and setters

    public void setID(Long iD)
    {
        this.iD = iD;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Long getID()
    {
        return this.iD;
    }

    public String getValue()
    {
        return this.value;
    }
}