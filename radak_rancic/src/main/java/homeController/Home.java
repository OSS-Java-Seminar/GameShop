package homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	@GetMapping("/")
	public String frontpage() {
		return "index";
	}
}
