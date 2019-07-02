package com.clinic.petclinic.domain;

import javax.persistence.*;

@Entity
@Table(name="Perm")
public class Perm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "perm_type")
    private String permType;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermType() {
        return permType;
    }

    public void setPermType(String permType) {
        this.permType = permType;
    }
}
