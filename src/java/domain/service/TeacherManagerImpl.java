/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.service;

import dao.service.ITeacherDao;
import domain.model.Teacher;

/**
 *
 * @author ApeX
 */
public class TeacherManagerImpl implements ITeacherManager {

    private ITeacherDao teacherDao;
    
    public void setTeacherDao(ITeacherDao teacherDao)
    {
        this.teacherDao = teacherDao;
    }
    
    @Override
    public Teacher getTeacher(int idTeacher) {
        
        return this.teacherDao.getTeacher(idTeacher);
    }
    

}
