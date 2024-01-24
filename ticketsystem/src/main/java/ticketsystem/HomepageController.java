package ticketsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomepageController {
 
 @GetMapping("/")
 public RedirectView welcome() {
	    return new RedirectView("http://localhost:8085/index.html");
 }
}