package com.example.oop;

public class Animal {
    // Thuộc tính
    private String name;
    private Integer weight;

    // Phương thức khởi tạo
    public Animal(String name, Integer weight){
        this.name = name;
        this.weight = weight;
    }
    //set
    public void setName(String name){
        this.name = name;
    }

    //get
    public String getName(String name){
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
