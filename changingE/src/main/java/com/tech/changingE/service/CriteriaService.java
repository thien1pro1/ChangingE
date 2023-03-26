package com.tech.changingE.service;

import com.tech.changingE.entity.Criteria;
import com.tech.changingE.entity.DetailCriteria;
import com.tech.changingE.repository.CriteriaRepository;
import com.tech.changingE.repository.DetailCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CriteriaService {
    @Autowired
    CriteriaRepository criteriaRepository;

    @Autowired
    DetailCriteriaRepository detailCriteriaRepository;

    public int getCriteriaScope(Criteria criteria){
        int scope = 0;
        List<DetailCriteria> detailCriteriaList = detailCriteriaRepository.findByCriteria(criteria.getId());
        for(DetailCriteria detailCriteria:detailCriteriaList){
            if(!detailCriteria.isObligatory()){
                if(criteria.getMaxScope()>scope+detailCriteria.getScope())
                    scope+=detailCriteria.getScope();
            }
            else scope = detailCriteria.getMaxScope();

        }
        return scope;
    }
}
