package co.grandcircus.donut_api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//related to donut json with additional details

/*
 * "id": 1,
"ref": "https://grandcircusco.github.io/demo-apis/donuts/1.json",
"name": "Glazed",
"calories": 260,
"extras": [],
"photo": "https://grandcircusco.github.io/demo-apis/donuts/images/d1.jpg",
"photo_attribution": "https://www.publicdomainpictures.net/en/view-image.php?image=170500&picture=fresh-glazed-doughnut"
 * 
 */
public class DonutDetails{

	private Long id;
	@JsonProperty("ref")
	private String detailUrl;	
	private String name;
	private int calories;
	private List<String> extras;
	private String photo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

	
	
}
