package com.sample.dao;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Course> courses;

    public Student(){
        
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
 
 
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Student [course=" + courses + ", id=" + id + ", name=" + name + "]";
    }
 

    

}
