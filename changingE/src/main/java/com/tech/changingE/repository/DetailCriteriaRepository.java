package com.tech.changingE.repository;

import com.tech.changingE.entity.Criteria;
import com.tech.changingE.entity.DetailCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailCriteriaRepository extends JpaRepository<DetailCriteria, Long> {
    List<DetailCriteria> findByCriteria(Long criteriaId);
    @Query("SELECT d FROM DetailCriteria d WHERE d.frame = ?1 and d.criteria = ?2")
    List<DetailCriteria> findByFrame(Boolean frame, Long criteriaId);


}
