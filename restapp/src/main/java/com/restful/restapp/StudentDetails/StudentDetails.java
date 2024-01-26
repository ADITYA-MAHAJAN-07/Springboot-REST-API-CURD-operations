package com.restful.restapp.StudentDetails;

import java.util.List;

import com.restful.restapp.entites.Student;

public interface StudentDetails {
    public List<Student> getStudents();
    public Student getStudent(long Studentrollcall);
    public Student addStudent(Student Student);
    public Student updateStudent(int rollcall,Student Student);
    public Student deleteStudent(long Studentrollcall);
}
