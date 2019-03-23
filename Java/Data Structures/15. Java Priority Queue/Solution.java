//     Author: Mohit Rajvardhan
//     Github: github.com/mohitrajvardhan17
// HackerRank: hackerrank.com/mohirajvardhan17

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private Integer id;
    private String name;
    private Double cgpa;

    public Student(Integer id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
}

class Priorities{

    private List<Student> students;

    public List<Student> getStudents(List<String> events){
        Comparator cmp =new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student obj1 = (Student) o1;
                Student obj2 = (Student) o2;
                if(obj1.getCgpa().compareTo(obj2.getCgpa())==0){
                    if(obj1.getName().equals(obj2.getName())){
                        return obj1.getId().compareTo(obj2.getId());
                    }
                    return obj1.getName().compareTo(obj2.getName());
                }
                return -obj1.getCgpa().compareTo(obj2.getCgpa());
            }
        };
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(10,cmp);
        for(String event: events){
            if(event.contains("ENTER")){
                String args[] = event.split(" ");
                int id = Integer.parseInt(args[3]);
                double cgpa = Double.parseDouble(args[2]);
                Student stud = new Student(id,args[1],cgpa);
                priorityQueue.add(stud);
            } else if (event.contains("SERVED")){
                priorityQueue.poll();
            }
        }

        List<Student> listStud = new ArrayList<>();

        for(Student student: priorityQueue){
            listStud.add(student);
        }
        listStud.sort(cmp);
        return listStud;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}