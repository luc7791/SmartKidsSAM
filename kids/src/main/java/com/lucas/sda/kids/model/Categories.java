package com.lucas.sda.kids.model;

import javax.persistence.*;

@Entity
@Table(name="categories")

public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq_gen")
    @SequenceGenerator( name = "cat_seq_gen", sequenceName = "cat_seq", allocationSize = 1)

    @Column(name="idcategories")
    private Integer idCategories;

    private String name;

    public Integer getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(Integer idCategories) {
        this.idCategories = idCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
