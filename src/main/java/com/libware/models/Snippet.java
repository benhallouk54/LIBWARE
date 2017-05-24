package com.libware.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snippet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	
	private Section[] sections;
	
	private String[] keywords;
	
		
	public Snippet(String title, Section[] sections, String[] keywords)
	{
		this.title = title;
		this.sections = sections;
		this.keywords = keywords;
	}
	
	public String getTitle() {
		
		return title;		
	}
	public void setTitle(String title) {
		
		this.title = title;		
	}
	

	public Section[] getSections() {
		return sections;
	}
	public void setSections(Section[] sections) {
		this.sections = sections;
	}

	public String[] getKeywords() {
		return keywords;
	}
	public void setKeywords(String[] keywords) {
		
		this.keywords = keywords;	
	}
	
}
		
	
	
