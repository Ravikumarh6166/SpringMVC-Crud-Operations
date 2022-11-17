package com.fsg.springmvc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsg.springmvc.crud.dao.DoctotrsDao;
import com.fsg.springmvc.crud.model.Doctors;

@Service
public class DoctorsService {

	@Autowired
	DoctotrsDao doctotrsDao;

	// add doctor

	public void addDoctors(Doctors doc) {
		doctotrsDao.addDoctors(doc);
	}

	// get all doctor
	public List<Doctors> getAllDoctors() {
		return doctotrsDao.getAllDoctors();

	}
	// get emp by id

	public Doctors getById(Long id) {
		return doctotrsDao.getDoctorsById(id);
	}

	// update doctor

	public void updateDoctors(Doctors doc) {
		doctotrsDao.updateDoctors(doc);
	}

	// delete doctor

	public void deleteDoctors(Long id) {
		doctotrsDao.deleteDoctors(id);
	}

}
