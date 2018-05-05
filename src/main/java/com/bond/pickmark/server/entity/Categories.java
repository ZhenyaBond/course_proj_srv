package com.bond.pickmark.server.entity;

import javax.persistence.*;


@Entity
@Table(name = "categories")
public class Categories {
    @Id
    @Column(name = "category_id")
    @SequenceGenerator(name = "category_seq_gen", sequenceName = "cat_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "category_seq_gen")
    private long category_id;

    @Column(name = "category_name", nullable = false, length = 30)
    private String category_name;

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Categories() {

    }
}
