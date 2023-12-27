package ru.vsu.cs.korobov;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
	Faculty csf = new Faculty("CSF");
    Institute vsu = new Institute("VSU", "University square, 1");

    csf.setInstitutes(vsu);

    ResearchAssociate employee1 = new ResearchAssociate(1, "Ivan Ivanov", "jsdjd@gmail.com", "it");
    ResearchAssociate employee2 = new ResearchAssociate(2, "Dmitriy Dmitriev", "tamara@gmail.com", "economy");
    vsu.setEmployees(new ResearchAssociate[]{employee1, employee2});

    Project project1 = new Project("I'm not a teapot",
            new SimpleDateFormat( "dd.MM.yyyy" ).parse( "12.12.2023" ),
            new SimpleDateFormat( "dd.MM.yyyy" ).parse( "08.03.2024" ), new Participation(5));
    employee1.setProjects(new Project[]{project1});

    Course course1 = new Course("Finance", 25, 60);
    Lecturer lecturer1 = new Lecturer(5, "Victor Victor", "victor@gmail.com", "finance");
    lecturer1.setCourses(new Course[]{course1});

    AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
            "Stepan Stepanov", "stepan@gmail.com", "admin");

    Institute institute = csf.getInstitutes();
    System.out.println("Institutes on " + csf.getName() + ": \n");

        System.out.println(institute.getName());

    System.out.println();

    ResearchAssociate[] researchEconomy = vsu.getEmployees();
    System.out.println("Research Associates on " + vsu.getName() + ": \n");
    for (ResearchAssociate researchAssociate : researchEconomy) {
        System.out.println(researchAssociate.getName());
    }
    System.out.println();


    Project[] projects = employee1.getProjects();
    System.out.println("Projects of " + employee1.getName() + ": \n");
    for (Project project : projects) {
        System.out.println(project.getName());
    }
    System.out.println();

    Course[] courses = lecturer1.getCourses();
    System.out.println("Courses of " + lecturer1.getName() + ": \n");
    for (Course course : courses) {
        System.out.println(course.getName());
    }
    System.out.println();
    System.out.println("Admin:");
    System.out.println();
    System.out.println(administrativeEmployee.getName());
    }
}
