package com.trueit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller("loginController")
public class BaseController  {
	
//	@Autowired
//	SecurityServiceFacade  securityServiceFacade;
//	
	@RequestMapping(value="main", method = RequestMethod.GET)
    public ModelAndView onInitMain() {
        
        return new ModelAndView("mainContent/main", "userForm",new String());
    }
	
//	@RequestMapping(value="init", method = RequestMethod.GET)
//    public ModelAndView onInitLogin() {
//        
//        return new ModelAndView("login/userForm", "userForm", new ObjUser());
//    }
//	
//    @RequestMapping(value="loginSubmit", method = RequestMethod.POST)
//    public ModelAndView loginSubmit(@ModelAttribute("userForm") ObjUser userForm,BindingResult result, Model model ) {
//    	
//    	ObjGenericResult objGenericResult = new ObjGenericResult();
//    	//call Service
//        objGenericResult = securityServiceFacade.loginUser(userForm);
//    	if(BaseConstant.STATUS_FAIL.equals(objGenericResult.getObjMessage().getResultStatus())){
//    		return errorPage(objGenericResult.getObjMessage().getResultMessage(), "main.do");
//    	}
//        return new ModelAndView("mainContent/main", "user", objGenericResult);
//       
//    }
    
}
