package com.bond.pickmark.server.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @Column(name = "location_id")
    @SequenceGenerator(name = "location_seq_gen", sequenceName = "loc_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "location_seq_gen")
    private long location_id;

    @Column(name = "location_name", nullable = false, length = 30)
    private String location_name;

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public Locations() {
    }
}
