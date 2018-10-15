package org.wecancodeit.pairgenerator.repository;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.pairgenerator.model.Student;

public class StudentRepositoryTest {

	private StudentRepository studentRepo = new StudentRepository();

	@Test
	public void shouldAcceptStudent() {
		// Arrange
		Student testStudent = new Student(1L, "Sam");
		// Act
		int repoSizeBeforeAdding = studentRepo.size();
		studentRepo.add(testStudent);
		int repoSizeAfterAdding = studentRepo.size();
		// Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 0)));
	}

	@Test
	public void shouldReturnOneStudent() {
		Student testStudent = new Student(1L, "Doug");
		studentRepo.add(testStudent);
		Student result = studentRepo.findOne(1L);
		assertThat(result.getStudent(), is("Doug"));
	}

	@Test
	public void shouldReturnAllStudents() {
		Student testStudent1 = new Student(1L, "Doug");
		Student testStudent2 = new Student(2L, "Biff");
		studentRepo.add(testStudent1);
		studentRepo.add(testStudent2);
		Collection<Student> result = studentRepo.findAll();
		assertThat(result, hasItems(testStudent1, testStudent2));
	}
}