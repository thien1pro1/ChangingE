package com.tech.changingE.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Criteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "max_scope")
    private int maxScope;
    @ManyToOne
    @JoinColumn(name = "group_criteria_id")
    private GroupCriteria groupCriteria;

    @OneToMany(mappedBy = "criteria")
    private List<DetailCriteria> detailCriterias;

    @Column(name = "frame")
    private boolean frame;

}
