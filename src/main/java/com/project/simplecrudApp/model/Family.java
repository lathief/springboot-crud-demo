package com.project.simplecrudApp.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String familymame;
}
