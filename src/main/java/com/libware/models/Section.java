package com.libware.models;

public class Section {
	private String title;
	private String description;
	private String code;
	private String technology;
	
	public Section(String title,String description,String code,String technology){
		 this.title=title;
		 this.description=description;
		 this.code=code;
		 this.technology=technology;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
