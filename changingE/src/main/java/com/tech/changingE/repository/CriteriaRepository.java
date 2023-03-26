package com.tech.changingE.repository;

import com.tech.changingE.entity.Criteria;
import com.tech.changingE.entity.DetailCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriteriaRepository extends JpaRepository<Criteria, Long> {
    List<Criteria> findByGroupCriteria(Long groupCriteriaId);

}
