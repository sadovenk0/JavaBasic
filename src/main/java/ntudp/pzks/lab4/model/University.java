package ntudp.pzks.lab4.model;

 import java.util.List;
 import java.util.Objects;

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

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         University that = (University) o;
         return Objects.equals(name, that.name) &&
                 Objects.equals(head, that.head) &&
                 Objects.equals(faculties, that.faculties);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, head, faculties);
     }
 }