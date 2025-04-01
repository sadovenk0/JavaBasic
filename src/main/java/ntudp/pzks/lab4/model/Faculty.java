package ntudp.pzks.lab4.model;

 import java.util.List;
 import java.util.Objects;

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

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Faculty that = (Faculty) o;
         return Objects.equals(name, that.name) &&
                 Objects.equals(head, that.head) &&
                 Objects.equals(departments, that.departments);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, head, departments);
     }
 }