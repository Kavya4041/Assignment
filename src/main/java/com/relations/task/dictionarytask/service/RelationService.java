package com.relations.task.dictionarytask.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.relations.task.dictionarytask.entity.RelationEntity;
import com.relations.task.dictionarytask.repository.DataRepository;

@Component
public class RelationService {
	@Autowired
	private DataRepository datarepo;
	@Autowired
	ModelMapper modelMapper;

	public void createwords(RelationEntity relationEntity) {
		// TODO Auto-generated method stub
		datarepo.save(relationEntity);
		
	}
	
public List<RelationEntity> getData() {
		
		List<RelationEntity> relationEntity = datarepo.findAll();
		return relationEntity;
	}

public List<RelationEntity> getfilteredData(String relation) {
	List<RelationEntity> relationEntity = datarepo.findAll();
	
	List<RelationEntity> relations =relationEntity.stream().filter(val->val.getRelation()=="relation").map(s->modelMapper.map(s, RelationEntity.class)).collect(Collectors.toList());
	//System.out.println(relations);
	return relations;
}


}
