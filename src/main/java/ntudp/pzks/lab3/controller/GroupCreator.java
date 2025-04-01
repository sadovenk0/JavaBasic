package ntudp.pzks.lab3.controller;

 import ntudp.pzks.lab3.model.Group;
 import ntudp.pzks.lab3.model.Human;
 import ntudp.pzks.lab3.model.Student;

 import java.util.List;

 public class GroupCreator extends StudentCreator {
     public static Group createGroup(String name, Human head, List<Student> students) {
         return new Group(name, head, students);
     }
 }