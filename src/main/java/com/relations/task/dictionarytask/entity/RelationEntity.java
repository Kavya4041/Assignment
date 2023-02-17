package com.relations.task.dictionarytask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RelationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String word1;
	private String word2;
	private String relation;
	public RelationEntity()
	{
		
	}
	
	public RelationEntity(Integer id,String word1, String word2, String relation) {
		super();
		this.id = id;
		this.word1 = word1;
		this.word2 = word2;
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "RelationEntity [id=" + id + ", word1=" + word1 + ", word2=" + word2 + ", relation=" + relation + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the word1
	 */
	public String getWord1() {
		return word1;
	}
	/**
	 * @param word1 the word1 to set
	 */
	public void setWord1(String word1) {
		this.word1 = word1;
	}
	/**
	 * @return the word2
	 */
	public String getWord2() {
		return word2;
	}
	/**
	 * @param word2 the word2 to set
	 */
	public void setWord2(String word2) {
		this.word2 = word2;
	}
	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}
	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	

}
