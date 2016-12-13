package com.shana.biochemistry.condition;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Lidan Li
 */
@RepositoryRestResource(collectionResourceRel = "condition",path = "condition")
public interface ConditionRepository extends JpaRepository<Condition, String> {

    Condition findById(@Param("conditionId") String id);

    List<Condition> findByNameLikeIgnoreCaseOrderByNameAsc(@Param("name") String name);

}
