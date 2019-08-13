package co.grandcircus.donut_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//First level of donut details from json
//related to results

/*
 * "id": 1,
"ref": "https://grandcircusco.github.io/demo-apis/donuts/1.json",
"name": "Glazed"
 * 
 */
public class Donut {
	
	private Long id;
	@JsonProperty("ref")
	private String detailUrl;	
	private String name;
	
	
	//public Donut() {}

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

	@Override
	public String toString() {
		return "Donut [id=" + id + ", detailUrl=" + detailUrl + ", name=" + name + "]";
	}
	
	
	
	
}
