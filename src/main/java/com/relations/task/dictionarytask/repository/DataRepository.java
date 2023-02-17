package com.relations.task.dictionarytask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relations.task.dictionarytask.entity.RelationEntity;

@Repository
public interface DataRepository extends JpaRepository<RelationEntity,Integer> {

}
