package ntudp.pzks.lab4.controller;

import ntudp.pzks.lab4.model.Department;
import ntudp.pzks.lab4.model.Faculty;
import ntudp.pzks.lab4.model.Human;

import java.util.List;

 public class FacultyCreator extends DepartmentCreator {
     public static Faculty createFaculty(String name, Human head, List<Department> departments) {
         return new Faculty(name, head, departments);
     }
 }