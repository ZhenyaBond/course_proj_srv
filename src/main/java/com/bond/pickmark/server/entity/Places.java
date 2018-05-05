package com.bond.pickmark.server.entity;

import javax.persistence.*;


@Entity
@Table(name = "places")
public class Places {
    @Id
    @Column(name = "place_id")
    @SequenceGenerator(name = "place_seq_gen", sequenceName = "place_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "place_seq_gen")
    private long place_id;

    @Column(name = "place_name", nullable = true, length = 100)
    private String place_name;

    @Column(name = "place_category", nullable = false, length = 100)
    private int place_category;

    @Column(name = "place_location", nullable = false, length = 100)
    private int place_location;

    @Column(name = "place_address", nullable = true, length = 100)
    private String place_address;

    @Column(name = "place_latitude", nullable = false, length = 100)
    private Double place_latitude;

    @Column(name = "place_longitude", nullable = false, length = 100)
    private Double place_longitude;

    public long getPlace_id() {
        return place_id;
    }

    public void setPlace_id(long place_id) {
        this.place_id = place_id;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public int getPlace_category() {
        return place_category;
    }

    public void setPlace_category(int place_category) {
        this.place_category = place_category;
    }

    public int getPlace_location() {
        return place_location;
    }

    public void setPlace_location(int place_location) {
        this.place_location = place_location;
    }

    public String getPlace_address() {
        return place_address;
    }

    public void setPlace_address(String place_address) {
        this.place_address = place_address;
    }

    public Double getPlace_latitude() {
        return place_latitude;
    }

    public void setPlace_latitude(Double place_latitude) {
        this.place_latitude = place_latitude;
    }

    public Double getPlace_longitude() {
        return place_longitude;
    }

    public void setPlace_longitude(Double place_longitude) {
        this.place_longitude = place_longitude;
    }

    public Places() {

    }


}
