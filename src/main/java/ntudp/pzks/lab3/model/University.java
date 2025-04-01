package ntudp.pzks.lab3.model;

 import java.util.List;

 public class University {
     private String name;
     private Human head;
     private List<Faculty> faculties;

     public University(String name, Human head, List<Faculty> faculties) {
         this.name = name;
         this.head = head;
         this.faculties = faculties;
     }

     public String getName() {
         return name;
     }

     public Human getHead() {
         return head;
     }

     public List<Faculty> getFaculties() {
         return faculties;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("University: ").append(name).append(", headed by: ").append(head.toString()).append("\n");
         for (Faculty faculty : faculties) {
            sb.append(faculty.toString()).append("\n");
         }
         return sb.toString();
     }
 }