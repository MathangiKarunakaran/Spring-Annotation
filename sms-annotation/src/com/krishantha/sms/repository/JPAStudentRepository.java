package com.krishantha.sms.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishantha.sms.model.Student;

@Repository("a")
public class JPAStudentRepository implements StudentRepository{

	@Override
	public List<Student> fetchAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
