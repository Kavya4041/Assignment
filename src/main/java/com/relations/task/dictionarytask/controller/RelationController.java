package com.relations.task.dictionarytask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relations.task.dictionarytask.entity.RelationEntity;
import com.relations.task.dictionarytask.service.RelationService;

@RestController
public class RelationController {
	@Autowired RelationService relationService;

	@PostMapping("/addwords")
	public HttpStatus addStudentdetails(@RequestBody RelationEntity relationEntity)
	{
		
	relationService.createwords(relationEntity);
	return HttpStatus.CREATED;

	}
	@GetMapping("/relationslist")
	public List<RelationEntity> getdetails()
	{
		List<RelationEntity> relationslist = relationService.getData();
		return relationslist;
	}
	
	@GetMapping("/filterrelationslist")
	public List<RelationEntity> getfiltereddetails(@RequestParam(required = true) String relation)
	{
		List<RelationEntity> relationslist = relationService.getfilteredData(relation);
		return relationslist;
	}

}
