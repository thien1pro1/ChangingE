package com.tech.changingE.repository;

import com.tech.changingE.entity.DetailCriteria;
import com.tech.changingE.entity.GroupCriteria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupCriteriaRepository extends JpaRepository<GroupCriteria, Long> {
}
