/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.pages;

import domain.service.ITeacherManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author ApeX
 */
public class ViewTeacherInformationsController implements Controller {

    private ITeacherManager teacherManager;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ModelAndView modelAndView = new ModelAndView("viewTeacherInformations");
        modelAndView.addObject("id", this.teacherManager.getTeacher(1).getId());
        modelAndView.addObject("firstname", this.teacherManager.getTeacher(1).getFirstname());
        modelAndView.addObject("lastname", this.teacherManager.getTeacher(1).getLastname());

        return modelAndView;

    }

    public void setTeacherManager(ITeacherManager teacherManager) {
        this.teacherManager = teacherManager;
    }
}
