package com.tech.changingE.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;



    @OneToMany(mappedBy = "result")
    private List<GroupCriteria> groupCriterias;

}
