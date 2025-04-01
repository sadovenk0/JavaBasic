package ntudp.pzks.lab3.model;

 import java.util.List;

 public class Group {
     private String name;
     private Human head;
     private List<Student> students;

     public Group(String name, Human head, List<Student> students) {
         this.name = name;
         this.head = head;
         this.students = students;
     }

     public String getName() {
         return name;
     }

     public Human getHead() {
         return head;
     }

     public List<Student> getStudents() {
         return students;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("\t\t\tGroup: ").append(this.getName()).append(", headed by: ").append(this.getHead().toString()).append("\n");
         for (Student student : this.getStudents()) {
             sb.append("\t\t\t\tStudent: ").append(student.toString()).append("\n");
         }
         return sb.toString();
     }
 }