package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class StudentService {
    public static void main(String... args){
      StudentService ss= new StudentService();
      ss.addStudent();
      ss.getStudents();
    }

    public void addStudent(){
        Student student = new Student();
        List<Student> studentList = new ArrayList<Student>();
        student.setStudentId("001");
        student.setName("name");
        student.setCourse("MCA");
        student.setStartDate("01/08/2023");
        student.setEndDate("08/01/2026");
        studentList.add(student);
        Student student1 = new Student();
        student1.setStudentId("21UCA024");
        student1.setName("kumaravel");
        student1.setCourse("BCA");
        student1.setStartDate("01/08/2023");
        student1.setEndDate("08/01/2026");
        studentList.add(student1);



    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
