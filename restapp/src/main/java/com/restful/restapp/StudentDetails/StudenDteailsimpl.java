package com.restful.restapp.StudentDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.restapp.entites.Student;
@Service
public class StudenDteailsimpl implements StudentDetails {
	List<Student> list;
	public StudenDteailsimpl() {
		list=new ArrayList<>();
		list.add(new Student(1,"aditya",98,7030118,"rajendra"));
		list.add(new Student(2,"yash",96,9872118,"adi"));
	}
  @Override
  public List<Student> getStudents(){
	  return list;
  }
@Override
public Student getStudent(long Studentrollcall) {
	Student a = null;
	for(Student Student:list) {
		if(Student.getRollcall()==Studentrollcall) {
			a = Student;
			break;
		}
	}
	return a;
}
@Override
public Student addStudent(Student Student) {
	list.add(Student);
	return Student ;
}
@Override
public Student updateStudent (int rollcall,Student Student) {
	list.set(rollcall, Student);
	return Student;
}

@Override
public Student deleteStudent(long Studentrollcall) {
	Student a = null;
	list.remove(Studentrollcall);
	return a;
}

}


