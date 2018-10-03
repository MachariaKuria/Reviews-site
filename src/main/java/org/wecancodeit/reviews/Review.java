package org.wecancodeit.reviews;

public class Review {

	private long id;
	private String name;
	private String category;
	private String imgUrl;
	private String title;
	private String description;


	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public Long getId() {
		
		return id;
	}

	public Review(long id, String name, String category, String imgUrl, String title, String description) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.imgUrl = imgUrl;
		this.title = title;
		this.description = description;

	}
	
}
