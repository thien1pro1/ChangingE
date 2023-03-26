package com.tech.changingE.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class GroupCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "max_scope")
    private int maxScope;
    @ManyToOne
    @JoinColumn(name = "result_id")
    private Result result;
    @OneToMany(mappedBy = "groupCriteria")
    private List<Criteria> criterias;
    @Column(name = "frame")
    private boolean frame;

}
