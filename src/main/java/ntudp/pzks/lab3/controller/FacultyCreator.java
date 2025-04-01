package ntudp.pzks.lab3.controller;

 import ntudp.pzks.lab3.model.Faculty;
 import ntudp.pzks.lab3.model.Human;
 import ntudp.pzks.lab3.model.Department;

 import java.util.List;

 public class FacultyCreator extends DepartmentCreator {
     public static Faculty createFaculty(String name, Human head, List<Department> departments) {
         return new Faculty(name, head, departments);
     }
 }