package com.fsg.springmvc.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.fsg.springmvc.crud.model.Doctors;

@Component
public class DoctotrsDao {

	@Autowired
	HibernateTemplate hiberTemplate;

// add doctors
	@Transactional
	public void addDoctors(Doctors doc) {
		hiberTemplate.save(doc);
	}

// get all doctors
	public List<Doctors> getAllDoctors() {
		return hiberTemplate.loadAll(Doctors.class);

	}

// get doctors by id
	@Transactional
	public Doctors getDoctorsById(long id) {
		Doctors doc = hiberTemplate.get(Doctors.class, id);
		return doc;
	}

// update doctors
	@Transactional
	public void updateDoctors(Doctors doc) {
		hiberTemplate.update(doc);
	}

// delete doctors
	@Transactional
	public void deleteDoctors(long id) {
		hiberTemplate.delete(hiberTemplate.load(Doctors.class, id));
	}

}
