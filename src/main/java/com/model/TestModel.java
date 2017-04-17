package com.model;


/**
 * Created by scurto on 10.04.2017.
 */

public class TestModel {

    private String id;
    private String name;
    private String age;
    private String description;

    public TestModel(String id, String name, String age, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
