package chan.shre.dars.web.pub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import chan.shre.dars.dao.pub.RegistrationDao;
import chan.shre.dars.model.pub.User;
import chan.shre.dars.services.pub.RegistrationService;

@Controller
@RequestMapping("/user")
public class RegistrationController {
    
	//private User user;
	@Autowired
	private RegistrationDao registrationDao;
	
	public RegistrationDao getRegistrationDao() {
		return registrationDao;
	}


	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}


	public RegistrationService getRegistrationService() {
		return registrationService;
	}


	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}


	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String startRegistration(@ModelAttribute User user,BindingResult bindingResult,ModelMap model)
	{  
		model.addAttribute("user", user);
	   System.out.println(user);
	  
	   return "user/Registration";
	   
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String postRegistration(@ModelAttribute User user)
	{    
		System.out.println(user.getEmail());
		System.out.println(user.getMobile());
				System.out.println(user.getName());
						System.out.println(user.getPassword());
								System.out.println(user.getUserId());
		
		 User us=registrationService.registerUser(user);
		 System.out.println(user);
		 return "Register/success";
	}
}
