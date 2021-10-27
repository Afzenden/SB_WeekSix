package com.sam.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.AUTO)


    private String name;
    private String phone;
    private String email;

    @ManyToMany(targetEntity = Office.class, cascade = CascadeType.ALL)
    private List<Office> offices;

    @OneToMany(targetEntity = Buyers.class)
    private List<Buyers> buyersList;

    @OneToMany(targetEntity = Messages.class)
    private List<Messages> msgBoardList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
