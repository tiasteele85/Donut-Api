package co.grandcircus.donut_api;

import org.springframework.web.client.RestTemplate;

import co.grandcircus.donut_api.model.Donut;
import co.grandcircus.donut_api.model.DonutDetails;
import co.grandcircus.donut_api.model.DonutResponse;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;


@Component
public class ApiService {

		
	RestTemplate restTemplate;
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Donut> showAll(){
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		List<Donut> donuts = response.getDonut();
		return donuts;
	}
	
	public DonutDetails showDetail(Long id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/"+ id +".json";
		DonutDetails response = restTemplate.getForObject(url, DonutDetails.class);
		return response;
	}
}
