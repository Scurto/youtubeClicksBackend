package com.scurto.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by scurto on 13.12.2017.
 */
@Entity
@Table(name = "gclid")
public class Gclid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "gclid")
    private String gclid;

    @Column(name = "time")
    private String time;

    @Transient
    private LocalDateTime localDateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGclid() {
        return gclid;
    }

    public void setGclid(String gclid) {
        this.gclid = gclid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Gclid{" +
                "id=" + id +
                ", gclid='" + gclid + '\'' +
                ", time='" + time + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}