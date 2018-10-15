package org.wecancodeit.pairgenerator.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.pairgenerator.model.Student;

@Repository
public class StudentRepository {

	private Map<Long, Student> students = new HashMap<>();

	public StudentRepository() {
		add(new Student(1L, "Alex"));
		add(new Student(2L, "Ingrid"));
		add(new Student(3L, "Jane"));
		add(new Student(4L, "Joe"));
		add(new Student(5L, "Josh"));
		add(new Student(6L, "Justin"));
		add(new Student(7L, "Kelli"));
		add(new Student(8L, "Kevin"));
		add(new Student(9L, "Khoi"));
		add(new Student(10L, "Max"));
		add(new Student(11L, "Riely"));
		add(new Student(12L, "Thomas"));
		add(new Student(13L, "Tre"));
		add(new Student(14L, "Wayne"));
	}

	public void add(Student student) {
		students.put(student.getId(), student);

	}

	public int size() {
		return students.size();
	}

	public Student findOne(Long id) {
		return students.get(id);
	}

	public Collection<Student> findAll() {
		return students.values();
	}
}
