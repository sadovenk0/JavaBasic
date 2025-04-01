package ntudp.pzks.lab4;

import ntudp.pzks.lab4.controller.UniversityCreator;
import ntudp.pzks.lab4.model.*;

import java.util.ArrayList;
import java.util.List;

 public class Run {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         students.add(UniversityCreator.createStudent("Danylo", "Sadovyi", "Yuriyovich", Sex.MALE, "1"));
         students.add(UniversityCreator.createStudent("Volodymyr", "Petrenko", "Evgeniyevich", Sex.MALE, "2"));

         Human departmentHead = new Human("Michail", "Babenko", "Volodymyrovich", Sex.MALE);

         List<Group> groups = new ArrayList<>();
         groups.add(UniversityCreator.createGroup("122-21-1", departmentHead, students));

         List<Department> departments = new ArrayList<>();
         departments.add(UniversityCreator.createDepartment("PZKS", departmentHead, groups));

         Human facultyHead = new Human("Yanina", "Grechanovskaya", "Tarasivna", Sex.FEMALE);
         List<Faculty> faculties = new ArrayList<>();
         faculties.add(UniversityCreator.createFaculty("FІТ", facultyHead, departments));

         Human universityHead = new Human("Yuriy", "Sadovyi", "Olegovich", Sex.MALE);
         University university = UniversityCreator.createUniversity("Dnipro University of Technology", universityHead, faculties);

         System.out.println(university);
     }
 }