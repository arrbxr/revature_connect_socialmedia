package com.example.demo.Entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.*;

@Entity
@Table(name = "Post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long postID;

	private String userName;
	private String imageURL;
	private String description;
	private String postImgURL;
	private int likes;
	private Timestamp dateTime;


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "po_co", referencedColumnName = "postID")
	List<Comment> comments = new ArrayList<>();

	public Long getPostID() {
		return postID;
	}

	public void setPostID(Long postID) {
		this.postID = postID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostImgURL() {
		return postImgURL;
	}

	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Post(Long postID, String userName, String imageURL, String description, String postImgURL, int likes,
			Timestamp dateTime, List<Comment> comments) {
		super();
		this.postID = postID;
		this.userName = userName;
		this.imageURL = imageURL;
		this.description = description;
		this.postImgURL = postImgURL;
		this.likes = likes;
		this.dateTime = dateTime;
		this.comments = comments;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

}