package com.planisense.test.repository;

import com.planisense.test.dto.Summary;
import com.planisense.test.entity.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeRepository extends JpaRepository<Tree,Long> {
    @Query("""
            select new com.planisense.test.dto.Summary(t.district, count(*)) 
            from Tree t
            group by t.district
            order by t.district
            """)
    List<Summary> countByDistrict();
    @Query("""
            select new com.planisense.test.dto.Summary(t.type, count(*)) 
            from Tree t
            group by t.type
            order by t.type
            """)
    List<Summary> countByType();
}
