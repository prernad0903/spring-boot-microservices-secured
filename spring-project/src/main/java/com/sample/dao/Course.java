package com.sample.dao;

public class Course {
    
    private int id;
    private String name;

    public Course(){

    }


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + "]";
    }


    
}
