package webapp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	static Log log = LogFactory.getLog(WeatherController.class);
	
	
	@RequestMapping(value={"", "/"}, method=RequestMethod.GET)
	public String showForm() {
		log.info("#################");
		log.info("### showForm()");
		log.info("#################");
		
		return "weather/form";
	
	}
	
	@RequestMapping(value="/show", method=RequestMethod.POST)
	public String showWeather(Model model, String city) {
		log.info("#################");
		log.info("### showWeather()");
		log.info("#################");
		log.info("city = "+ city);
		
		return "weather/weather";
	}
}
