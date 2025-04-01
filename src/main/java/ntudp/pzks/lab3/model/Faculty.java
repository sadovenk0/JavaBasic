package ntudp.pzks.lab3.model;

 import java.util.List;

 public class Faculty {
     private String name;
     private Human head;
     private List<Department> departments;

     public Faculty(String name, Human head, List<Department> departments) {
         this.name = name;
         this.head = head;
         this.departments = departments;
     }

     public String getName() {
         return name;
     }

     public Human getHead() {
         return head;
     }

     public List<Department> getDepartments() {
         return departments;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("  Faculty: ").append(this.getName()).append(", headed by: ").append(this.getHead().toString()).append("\n");
         for (Department department : this.getDepartments()) {
            sb.append(department.toString()).append("\n");
         }
         return sb.toString();
     }
 }