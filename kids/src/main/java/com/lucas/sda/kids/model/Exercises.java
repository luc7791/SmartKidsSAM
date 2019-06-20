package com.lucas.sda.kids.model;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="exercises")

public class Exercises {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ex_seq_gen")
    @SequenceGenerator( name = "ex_seq_gen", sequenceName = "ex_seq", allocationSize = 1)

    private Integer idexercises;

    @Column (name="cat_id")
    private Integer catId;

    private String text;

    public Integer getIdexercises() {
        return idexercises;
    }

    public void setIdexercises(Integer idexercises) {
        this.idexercises = idexercises;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
