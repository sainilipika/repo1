package com.g.saccontrol;


@Controller
public class UsfControl{
	@RequestMapping(value="/UserForm.html" , method = RequestMethod.GET)
	public ModelAndView getUserForm(){
		ModelAndView mode1 = new ModelandView("User FORm");
		
		return mode1;
		
	}
	
@RequestMapping(value="/submitUserForm.html" , method = RequestMethod.POST)
public ModelAndView submitUserForm(@ModelAttribute("user1") user user1 ){
	 
	ModelAndView mode1 = new ModelAndView("admission Success");
	return mode1;
}
	
	
	
	
	
	
	
	
}