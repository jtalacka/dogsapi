package com.tieto.dogsapi.model;

import javax.persistence.*;

@Entity
@Table(name="animals")
public class Animal {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "fact")
    private String fact;
    @Column(name = "category")
    private String category;

    public void  setId(long id){
        this.id=id;
    }
    public long getId() {
        return id;
    }


    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
