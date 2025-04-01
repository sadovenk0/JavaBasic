package ntudp.pzks.lab4.model;

 import java.util.List;

 public class Department {
     private String name;
     private Human head;
     private List<Group> groups;

     public Department(String name, Human head, List<Group> groups) {
         this.name = name;
         this.head = head;
         this.groups = groups;
     }

     public String getName() {
         return name;
     }

     public Human getHead() {
         return head;
     }

     public List<Group> getGroups() {
         return groups;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("\t\tDepartment: ").append(this.getName()).append(", headed by: ").append(this.getHead().toString()).append("\n");
         for (Group group : this.getGroups()) {
            sb.append(group.toString()).append("\n");
         }
         return sb.toString();
     }
 }