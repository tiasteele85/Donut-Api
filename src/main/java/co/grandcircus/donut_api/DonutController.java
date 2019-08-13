package co.grandcircus.donut_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.grandcircus.donut_api.model.Donut;
import co.grandcircus.donut_api.model.DonutDetails;

@Controller
public class DonutController {

	@Autowired
	private ApiService apiService;
	private List<Donut> donuts;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		donuts = apiService.showAll();
		return new ModelAndView("home", "donuts", donuts);
	}
	
	@RequestMapping("/donut")
	public ModelAndView showDetailPage(
			@RequestParam(value="id", required=false) Long id) {
		DonutDetails dd = apiService.showDetail(id);
		return new ModelAndView("donut", "donut", dd);
	}
	
}
