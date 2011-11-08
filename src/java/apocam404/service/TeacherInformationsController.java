/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apocam404.service;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ApeX
 */
public class TeacherInformationsController implements Controller {
    
    protected final Log logger = LogFactory.getLog(getClass()); 

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
        int idTeacher = request.getParameter("idTeacher");
        
        Teacher teacher = new Teacher(idTeacher);
        teacher.load();//Utile ou pas avec Hibernate ?
        
        Map<String, Object> teacherInformations = new HashMap<String, Object>();
        teacherInformations.put("name", teacher.getName());
        teacherInformations.put("surname", teacher.getSurname());
        
        return new ModelAndView("teacherInformations", "informations", teacherInformations);
        
    }

}
