package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;

        Student s = (Student) o;
        return this.rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }

    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<>();

        studentSet.add(new Student("Anuj", 1));
        studentSet.add(new Student("Rohit", 2));
        studentSet.add(new Student("Shivam", 3));
        studentSet.add(new Student("Rahul", 1));

        System.out.println(studentSet);
    }
}