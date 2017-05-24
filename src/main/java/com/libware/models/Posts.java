package com.libware.models;

import com.libware.utils.*;

import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Entity
@Table(name = "posts")
public class Posts {

	@Id
	@GeneratedValue
	private Long Id;

	@Column(length = 250, nullable = false)
	private String title;

	@Lob
	private String shortTextPart;

	@Lob
	@Column(nullable = false)
	private String fullPostText;

	@Column(nullable = false)
	@Convert(converter = LocalDateTimePersistenceConverter.class)
	private LocalDateTime dateTime;

	@Column(nullable = false)
	private boolean hidden = false;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "posts_tags", joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
	@OrderBy("name ASC")
	private Collection<Tag> tags = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)
	@OrderBy("dateTime ASC")

	public static String shortPartSeparator() {
		return "===cut===";
	}

	public boolean hasShortTextPart() {
		return !StringUtils.isEmpty(shortTextPart);
	}

	public String shortTextPartHtml() {
		return MarkdownConverter.toHtml(getShortTextPart());
	}

	public String fullPostTextHtml() {
		return MarkdownConverter.toHtml(getFullPostText().replace(shortPartSeparator(), ""));
	}

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

	public String getShortTextPart() {
		return shortTextPart;
	}

	public void setShortTextPart(String shortTextPart) {
		this.shortTextPart = shortTextPart;
	}

	public String getFullPostText() {
		return fullPostText;
	}

	public void setFullPostText(String fullPostText) {
		this.fullPostText = fullPostText;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

}