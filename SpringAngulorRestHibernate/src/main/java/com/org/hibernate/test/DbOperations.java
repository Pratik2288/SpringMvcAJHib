package com.org.hibernate.test;

import java.util.List;

import com.org.hibernate.dao.StudentDAO;
import com.org.hibernate.dao.UserDao;
import com.org.hibernate.pojo.Student;
import com.org.hibernate.pojo.User;
 
public class DbOperations {
 
    StudentDAO studentDAO = new StudentDAO();
 
    public static void main(String[] args) {
        DbOperations dbOperations = new DbOperations();
        User createStudent = dbOperations.createUser();
 
       List<User> userList = dbOperations.getUserList();
        if (userList != null) {
            for (User user : userList) {
                System.out.println("Student Name : " + user);
            }
        }
        
        /*
         *  DbOperations dbOperations = new DbOperations();
        Student createStudent = dbOperations.createStudent();
 
       List<Student> studentList = dbOperations.getStudentList();
        if (studentList != null) {
            for (Student student : studentList) {
                System.out.println("Student Name : " + student.getName());
            }
        }
        dbOperations.updateStudent(createStudent.getId());
        Student student = dbOperations.getStudent(createStudent.getId());
        if (student != null) {
            System.out.println("Student Details After Updation : " + student.getName());
        }
 
        dbOperations.deleteStudent(createStudent.getId());
 */
    }
 
    public Student createStudent() {
        Student s = new Student();
        s.setGender(new Byte("1"));
        s.setName("smith");
        s.setClass_("12");
        s.setRollnumber(007);
        studentDAO.addStudent(s);
        return s;
    }
    
    public User createUser() {
    	UserDao ud =new UserDao();
    	User u =new User();
    	u.setUserId("Pratik123");
    	u.setFirstName("Pratik");
    	u.setLastName("Sharma");
    	u.setMobileNumber(new Integer(930892043));
    	u.setGender('M');
    	u.setPassword("Pass@123");
    	ud.addUser(u);
    	return u;
    	
    }
    public List<User> getUserList() {
    	UserDao ud =new UserDao();
        return ud.listUser();
    }
 
 
    public void updateStudent(Integer id) {
        Student student = studentDAO.findStudentById(id);
        student.setName("online tutorials point");
        studentDAO.updateStudent(student);
        System.out.println("Student Updated Success");
    }
 
    public void deleteStudent(Integer id) {
        studentDAO.deleteStudent(id);
        System.out.println("Student Deleted Success");
    }
 
    public List<Student> getStudentList() {
        return studentDAO.listStudent();
    }
 
    public Student getStudent(Integer id) {
        return studentDAO.findStudentById(id);
    }
 
}
