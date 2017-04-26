package com.nezha.domain;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = -5554561712056198940L;

    private Long id;
    private String name;
    private Integer age;

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
