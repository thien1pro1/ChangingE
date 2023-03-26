package com.tech.changingE.service;

import com.tech.changingE.entity.Criteria;
import com.tech.changingE.entity.DetailCriteria;
import com.tech.changingE.repository.CriteriaRepository;
import com.tech.changingE.repository.DetailCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DetailCriteriaService {
    @Autowired
    DetailCriteriaRepository detailCriteriaRepository;
    @Autowired
    CriteriaRepository criteriaRepository;

    public List<DetailCriteria> getAllDetailFrame(Criteria criteria){
        return detailCriteriaRepository.findByFrame(true, criteria.getId());
    }

    public List<DetailCriteria> getAllDetailCriteria(Criteria criteria){
        return detailCriteriaRepository.findByFrame(false, criteria.getId());
    }

    public DetailCriteria createDetailFrame(DetailCriteria detailCriteria) {
        Optional<DetailCriteria> exist = detailCriteriaRepository.findById(detailCriteria.getId());
        if (!exist.isPresent()) {
            DetailCriteria d = new DetailCriteria();
            d.setObligatory(detailCriteria.isObligatory());
            d.setContent(detailCriteria.getContent());
            d.setMaxScope(detailCriteria.getMaxScope());
            d.setCriteria(detailCriteria.getCriteria());
            d.setFrame(true);
            detailCriteriaRepository.save(d);
        }
        return detailCriteria;

    }

    public DetailCriteria createDetailCriteria(DetailCriteria detailCriteria) {
        Optional<DetailCriteria> exist = detailCriteriaRepository.findById(detailCriteria.getId());
        if (!exist.isPresent()) {
            DetailCriteria d = new DetailCriteria();
            d.setObligatory(detailCriteria.isObligatory());
            d.setMaxScope(detailCriteria.getMaxScope());
            d.setContent(detailCriteria.getContent());
            d.setScope(detailCriteria.getScope());
            d.setCriteria(detailCriteria.getCriteria());
            d.setFrame(false);
            detailCriteriaRepository.save(d);


        }
        return detailCriteria;

    }
}
