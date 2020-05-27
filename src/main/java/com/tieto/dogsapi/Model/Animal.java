package com.tieto.dogsapi.Model;

public class Animal {
    private int id;
    private String fact;
    private String category;

    public Animal(int id,String fact,String category){
        this.id=id;
        this.fact=fact;
        this.category=category;
    }
    public int getId(){
        return id;
    }
    public String getFact(){
        return fact;
    }
    public String getCategory(){
        return category;
    }
}
