package org.wecancodeit.pairgenerator.model;

public class Student {
	private String name;
	private Long id;

	public Student(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getStudent() {
		return name;
	}

	public Long getId() {
		return id;
	}
}
