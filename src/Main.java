import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Person("Plamen", 19, "Burgas");
        Person person2 = new Person("Ivan", 22, "Burgas");
        Person person3 = new Person("Rado", 44, "Burgas");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for(Person person : people) {
            System.out.println(person.toString());
        }
        */

        /*
        Student student1 = new Student("Plamen", "0443050523", new int[]{6, 6, 2, 6, 6, 6, 6, 6, 6, 6}, 3);
        Student student2 = new Student("Ivan", "0446170546", new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, 2);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);

        printStudents(students);
        printStudentsWithoutLowGrades(students);
        */

        Pharmacy pharmacy1 = new Pharmacy("ashvaganda", 10, 3, new L);
        Pharmacy pharmacy2 = new Pharmacy("nurofen", 4, 99, "11/14/2055");
        Pharmacy pharmacy3 = new Pharmacy("stromba", 7, 58, "09/22/2034");

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);

        printPharmacyWithLowerPriceThanFive(pharmacies);

        printAllMedicinesOnQuantities(pharmacies);


    }

    public static void printStudents(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();

        for (Student s : students) {
            if(s.course > 2) {
                newStudents.add(s);
            }
        }

        for (Student s1 : newStudents) {
            System.out.println(s1.name);
        }
    }

    public static void printPharmacyWithLowerPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        for (Pharmacy p : pharmacies) {
            if(p.price > 5) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printAllMedicinesOnQuantities(ArrayList<Pharmacy> pharmacies){
        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for(Pharmacy p : pharmacies){
            if(p.quantity < 10){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printPharmaciesWithExpirationDate(ArrayList<Pharmacy> pharmacies){

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        String date = "10/10/2055";

        for(Pharmacy p : pharmacies){
            if(p.expirationDate ){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printStudentsWithoutLowGrades(ArrayList<Student> students) {

        ArrayList<Student> newStudents = new ArrayList<>();
        boolean isTrue = false;

        for (Student s : students) {
            isTrue = false;
            for(int i = 0; i < s.grades.length; i++) {
                if(s.grades[i] < 3) {
                    isTrue = true;
                    break;
                }
            }

            if(isTrue == false) {
                newStudents.add(s);
            }
        }

        System.out.println("siuuuuuuuu");

        for (Student s1 : newStudents) {
            System.out.println(s1.toString());
        }
    }
}