package ntudp.pzks.lab4.controller;

import ntudp.pzks.lab4.model.Faculty;
import ntudp.pzks.lab4.model.Human;
import ntudp.pzks.lab4.model.University;

import java.util.List;

 public class UniversityCreator extends FacultyCreator {
     public static University createUniversity(String name, Human head, List<Faculty> faculties) {
         return new University(name, head, faculties);
     }
 }