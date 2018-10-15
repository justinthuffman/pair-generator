package org.wecancodeit.pairgenerator.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wecancodeit.pairgenerator.repository.StudentRepository;

@Controller
public class StudentController {

	@Resource
	private StudentRepository studentRepo = new StudentRepository();

	@GetMapping("/students")
	public String getStudent(Model model) {
		model.addAttribute("students", studentRepo.findAll());
		return "students";

	}

//	@GetMapping("/students/{id}")
//	public String getStudents(@PathVariable(value = "id") Long id, Model model) {
//		System.out.println(student);
//		return null;
//		
//	}

}
