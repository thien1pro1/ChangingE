package com.tech.changingE.dto;

import com.tech.changingE.entity.Criteria;
import com.tech.changingE.entity.DetailCriteria;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;
public class DetailCriteriaDTO {

    private Long id;

    private String content;

    private int maxScope;

    private int scope;

    private boolean obligatory;

    private Criteria criteria;

    public DetailCriteria toEntity(){
        DetailCriteria entity = new DetailCriteria();
        entity.setId(this.id);
        entity.setContent(this.content);
        entity.setMaxScope(this.maxScope);
        entity.setScope(this.scope);
        entity.setObligatory(this.obligatory);
        entity.setCriteria(this.criteria);
        return entity;
    }
}
