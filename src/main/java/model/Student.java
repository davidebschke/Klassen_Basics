package model;

public class Student {


    private String lastName;
    private String firstName;
    private String course;
    private int alter;

    public Student(String firstName, String lastName, String course, int alter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.alter = alter;
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

    public String toStringStudent() {
        return      "Der Vorname ist: "+ firstName + "\n"
                +   "Der Nachname ist: " + lastName + "\n"
                +   "Der Schüler gehört zu der Klasse: " + course + "\n"
                +   "Der Schüler ist " + alter + " Jahre alt";


    }


}
