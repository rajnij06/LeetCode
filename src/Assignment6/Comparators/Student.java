package Assignment6.Comparators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }
    static class NameComparato implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            return student1.name.compareTo(student2.name);
        }
    }
    static class GpaComparato implements Comparator<Student> {
        public int compare(Student student2, Student student1) {
            return (int)(student1.gpa - student2.gpa);
        }
    }
    static class DobComparato implements Comparator<Student> {
        public int compare(Student student2, Student student1) {
            return student2.dateOfBirth.compareTo(student1.dateOfBirth);
        }
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date dobAbhi = sdf1.parse("1992-04-01");
        Date dobSiaa = sdf1.parse("2005-11-06");
        Date dobBill = sdf1.parse("1999-02-01");
        Student Abhi = new Student(345,"Abhi",80.42, dobAbhi);
        Student Siaa = new Student(654,"Siaa",70.67, dobSiaa);
        Student Bill = new Student(234,"Bill",69.67, dobBill);

        ArrayList<Student> students = new ArrayList<>();
        students.add(Abhi);
        students.add(Siaa);
        students.add(Bill);

        Collections.sort(students, new NameComparato());
        System.out.println("1. Sort by ascending order of 'nam'");
        for (Student student : students) {
            System.out.println("Id: " + student.id + " Name: " + student.name + " gpa: " + student.gpa + " DateOfBirth: " + student.dateOfBirth);
        }
        System.out.println();
        Collections.sort(students, new GpaComparato());
        System.out.println("2. Sort by descending order of 'gpa'");
        for (Student student : students) {
            System.out.println("Id: " + student.id + " Name: " + student.name + " gpa: " + student.gpa + " DateOfBirth: " + student.dateOfBirth);
        }
        System.out.println();
        Collections.sort(students, new DobComparato());
        System.out.println("3. Sort by ascending order of 'dateOfBirt'");
        for (Student student : students) {
            System.out.println("Id: " + student.id + " Name: " + student.name + " gpa: " + student.gpa + " DateOfBirth: " + student.dateOfBirth);
        }
    }
}