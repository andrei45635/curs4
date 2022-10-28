import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        double a = 3.14;
        double b = 3.15;

        Student s1 = new Student("Andrei", 5.1f);
        StudentHelper f = (Student x) -> {
            return x.getGrade() > 5;
        }; //lambda function
        StudentHelper f1 = (x) -> x.getGrade() > 5; //lambda function

        System.out.println(f.graduated(s1) + " " + f1.graduated(s1));

        Comparator<Student> comp = (Student s, Student s2) -> {
            return (int) (s.getGrade() - s2.getGrade());
        };

        Student s2 = new Student("Dndrei", 4.1f);
        Student s3 = new Student("Mndrei", 3.1f);
        Student s4 = new Student("Cndrei", 2.1f);
        Student s5 = new Student("Bndrei", 9.1f);
        TreeSet<Student> treeStuds = new TreeSet<>(comp);
        treeStuds.addAll(Arrays.asList(s1, s2, s3, s4, s5));
        treeStuds.forEach((Student s) -> System.out.println(s));
        System.out.println("\n");
        TreeSet<Student> treeStuds1 = new TreeSet<>((Student x, Student y) -> {
            return x.getName().compareTo(y.getName());
        });
        treeStuds1.addAll(Arrays.asList(s1, s2, s3, s4, s5));
        //treeStuds1.forEach((Student s) -> System.out.println(s));
        treeStuds1.forEach(System.out::println);
    }
}
