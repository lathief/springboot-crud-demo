package com.project.simplecrudApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("first-name")
    private String firstname;
    @JsonProperty("last-name")
    private String lastname;
    @JsonIgnore
    private int age;
    @Embedded
    Address address;
    @OneToMany(cascade = CascadeType.ALL)
    List<Family> families;
}
