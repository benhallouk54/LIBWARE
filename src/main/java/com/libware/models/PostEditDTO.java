package com.libware.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class PostEditDTO {

	private Long Id = null;

	@Size.List({ @Size(min = 3, message = "Title too short"), @Size(max = 250, message = "Title too long") })
	@NotBlank
	private String title;

	@NotBlank
	@Size(min = 50)
	private String text;

	@NotBlank
	private String tags = "";

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
}