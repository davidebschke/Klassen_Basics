package model;

import java.util.Objects;

public class Student {


    private String lastName;
    private String firstName;
    private String course;
    private int alter;
    private int iD;

    public Student(String firstName, String lastName, String course, int alter,int iD) {
        this.firstName  =   firstName;
        this.lastName   =   lastName;
        this.course     =   course;
        this.alter      =   alter;
        this.iD         =   iD;
    }
    public Student() {}

    public Student(String studentennaman, int StudenteniD) {
        studentennaman=firstName;
        StudenteniD=iD;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course.equals(student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return      "Der Vorname ist: "+ firstName + "\n"
                +   "Der Nachname ist: " + lastName + "\n"
                +   "Der Schüler gehört zu der Klasse: " + course + "\n"
                +   "Der Schüler ist " + alter + " Jahre alt"+"\n"
                +   "Der Schüler hat folgende iD "+iD;


    }


}
