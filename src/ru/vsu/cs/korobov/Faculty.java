package ru.vsu.cs.korobov;

public class Faculty {

	private String name;
	private Institute institute;

	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute getInstitutes() {
		return this.institute;
	}

	public void setInstitutes(Institute institute) {
		this.institute = institute;
	}

	public void addInstitute(Institute institute) {
		// TODO - implement Faculty.addInstitute
		throw new UnsupportedOperationException();
	}

	public void removeInstitute(Institute institute) {
		// TODO - implement Faculty.removeInstitute
		throw new UnsupportedOperationException();
	}

}