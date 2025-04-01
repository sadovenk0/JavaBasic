package ntudp.pzks.lab4.controller;

import ntudp.pzks.lab4.model.Group;
import ntudp.pzks.lab4.model.Human;
import ntudp.pzks.lab4.model.Student;

import java.util.List;

 public class GroupCreator extends StudentCreator {
     public static Group createGroup(String name, Human head, List<Student> students) {
         return new Group(name, head, students);
     }
 }