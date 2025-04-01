package ntudp.pzks.lab4.model;

import java.util.Objects;

public class Student extends Human {
     private String studentId;

     public Student(String firstName, String lastName, String middleName, Sex sex, String studentId) {
         super(firstName, lastName, middleName, sex);
         this.studentId = studentId;
     }

     public String getStudentId() {
         return studentId;
     }

     @Override
     public String toString() {
         return super.toString() + ", student number: " + studentId;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         if (!super.equals(o)) return false;
         Student student = (Student) o;
         return Objects.equals(studentId, student.studentId);
     }

     @Override
     public int hashCode() {
         return Objects.hash(super.hashCode(), studentId);
     }
 }