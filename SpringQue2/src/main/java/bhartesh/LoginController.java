package bhartesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class LoginController {
	
	LoginService service = new LoginService();
	
		@RequestMapping(value="/login", method=RequestMethod.GET)
		
		public String SimpleI(String name,String password) {
			
			
			return "login";
		}
		@RequestMapping(value="/login", method=RequestMethod.POST)
		
		public String SI(@RequestParam String name,@RequestParam String password, ModelMap model) {
			
			if(service.validateUser(name, password))
			{
				model.put("print", "Well-Come");
				return "Success";
			}
			else {
				model.put("error", "Invalid Cerdientials...!!");
				return "error";
			}
		}
}
