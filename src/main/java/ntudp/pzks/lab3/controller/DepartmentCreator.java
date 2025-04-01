package ntudp.pzks.lab3.controller;

 import ntudp.pzks.lab3.model.Department;
 import ntudp.pzks.lab3.model.Group;
 import ntudp.pzks.lab3.model.Human;

 import java.util.List;

 public class DepartmentCreator extends GroupCreator {
     public static Department createDepartment(String name, Human head, List<Group> groups) {
         return new Department(name, head, groups);
     }
 }