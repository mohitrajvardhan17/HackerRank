//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}


//Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Comparator<Student> cmp = new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                Double firstCgpa = o1.getCgpa();
                Double secondCgpa = o2.getCgpa();
                if (firstCgpa.doubleValue() == secondCgpa.doubleValue()) {
                    String firstName = o1.getFname();
                    String secondName = o2.getFname();
                    if (firstName.equals(secondName)) {
                        Integer firstId = o1.getId();
                        Integer secondId = o2.getId();
                        return firstId.compareTo(secondId);
                    }
                    return firstName.compareTo(secondName);
                }
                return secondCgpa.compareTo(firstCgpa);
            }
        };
        Student arr[] = new Student[studentList.size()];
        Arrays.sort(studentList.toArray(arr), cmp);
        studentList = Arrays.asList(arr);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}