package com.fsg.springmvc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fsg.springmvc.crud.model.Doctors;
import com.fsg.springmvc.crud.service.DoctorsService;

@Controller
@RequestMapping
public class DoctorsController {

	@Autowired
	private DoctorsService doctorsService;

	@RequestMapping("addDoctors")
	public String addDoctors() {
		return "AddDoctors";
	}

	@PostMapping("/insertDoctors")
	public String insertDoctors(@ModelAttribute("insertDoctors") Doctors doc) {
		doctorsService.addDoctors(doc);
		return "AddDoctors";
	}

	@GetMapping("doctorsReport")
	public String lodeDoctors(Model model) {
		model.addAttribute("doctors", doctorsService.getAllDoctors());
		model.addAttribute("title", "Doctors Report");

		return "DoctorsReport";
	}

	@GetMapping("editDoctors/{id}")
	public String lodeEditForm(@PathVariable(value = "id") Long id, Model model) {
		Doctors doc = doctorsService.getById(id);

		System.out.println(doc);
		model.addAttribute("doctors", doc);
		model.addAttribute("title", "Edit Doctors");

		return "EditDoctors";
	}

	@PostMapping("/editDoctors/updateDoctors")
	public String updateEmp(@ModelAttribute("updateDoctors") Doctors doc) {
		doctorsService.updateDoctors(doc);

		return "redirect:/doctorsReport";

	}

	@GetMapping("/deleteDoctors/{id}")
	public String deleteDoctors(@PathVariable Long id) {
		doctorsService.deleteDoctors(id);

		return "redirect:/doctorsReport";
	}

}
