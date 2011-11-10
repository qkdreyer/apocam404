/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.service;

import domain.model.Teacher;

/**
 *
 * @author ApeX
 */
public class TeacherDaoBD implements ITeacherDao {

    @Override
    public Teacher getTeacher(int idTeacher) {
        
        /* Juste pour le test */
        
        Teacher teacher = new Teacher();
        teacher.setId("1");
        teacher.setFirstname("Térence");
        teacher.setLastname("la terreur");
        
        return teacher;
        
    }
    
}
