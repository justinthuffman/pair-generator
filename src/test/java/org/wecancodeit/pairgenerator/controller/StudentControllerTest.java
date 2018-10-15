package org.wecancodeit.pairgenerator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeOkWhenAccessingStudents() throws Exception {
		mockMvc

				.perform(get("/students"))

				.andExpect(status().isOk());
	}

	@Test
	public void shouldShouldReturnStudentTemplateWhenAccessingStudent() throws Exception {
		mockMvc

				.perform(get("/students"))

				.andExpect(view().name("students"));

	}

}
