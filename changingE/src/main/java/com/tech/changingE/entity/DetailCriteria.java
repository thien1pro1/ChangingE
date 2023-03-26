package com.tech.changingE.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class DetailCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "max_scope")
    private int maxScope;

    @Column(name = "scope")
    private int scope;

    @Column(name = "obligatory")
    private boolean obligatory;

    @ManyToOne
    @JoinColumn(name = "criteria_id")
    private Criteria criteria;

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;

    }
    @Column(name = "frame")
    private boolean frame;


}
