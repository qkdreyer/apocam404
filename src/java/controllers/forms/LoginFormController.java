package controllers.forms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import domain.model.formobjects.Login;
import domain.model.formobjects.Login;
import domain.model.formobjects.Login;

@SuppressWarnings("deprecation")
public class LoginFormController extends SimpleFormController {
	
	@Override
	protected ModelAndView onSubmit(Object command) throws ServletException {
		Login login = (Login) command;
		String name = login.getUsername();
		String prestatement = "Hello";
		
		ModelAndView modelAndView = new ModelAndView(getSuccessView());
		modelAndView.addObject("name", name);	
		return modelAndView;
		
    }
}
