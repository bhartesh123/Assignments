package bhartesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LoginController {
	
	
		@RequestMapping(value="/login", method=RequestMethod.GET)
		
		public String SimpleI(int amount, int time,int rate) {
			
			int res=(amount*time*rate)/100;
			
			return "login";
		}
		@RequestMapping(value="/login", method=RequestMethod.POST)
		
		public String SI(@RequestParam int amount,@RequestParam int time,@RequestParam int rate, ModelMap model) {
			
			model.put("amount", amount);
			model.put("time", time);
			model.put("rate", rate);
			int res=(amount*time*rate)/100;
			model.put("x", res);
			return "welcome";
		}
}
