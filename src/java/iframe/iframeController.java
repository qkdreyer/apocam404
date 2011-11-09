/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iframe;

/**
 *
 * @author Tyty
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.mvc.SimpleFormController;
public class iframeController extends SimpleFormController {
    
    @Override
    protected ModelAndView onSubmit(Object command) throws ServletException {
        ModelAndView modelAndView = new ModelAndView(getSuccessView());
        return modelAndView;
    }
    
}