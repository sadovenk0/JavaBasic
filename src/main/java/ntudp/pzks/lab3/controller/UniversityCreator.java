package ntudp.pzks.lab3.controller;

 import ntudp.pzks.lab3.model.University;
 import ntudp.pzks.lab3.model.Human;
 import ntudp.pzks.lab3.model.Faculty;

 import java.util.List;

 public class UniversityCreator extends FacultyCreator {
     public static University createUniversity(String name, Human head, List<Faculty> faculties) {
         return new University(name, head, faculties);
     }
 }