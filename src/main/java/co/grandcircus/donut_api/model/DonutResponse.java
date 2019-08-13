package co.grandcircus.donut_api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {

	@JsonProperty("results")
	private List<Donut> donut;	

	
	public DonutResponse() {}

	public List<Donut> getDonut() {
		return donut;
	}

	public void setDonut(List<Donut> donut) {
		this.donut = donut;
	}


	
}
