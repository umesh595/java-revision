import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name,int age){
    this.name=name;
    this.age=age;
    }
    @Override
    public int compareTo(Student s){
        return this.age-s.age;
    }
    @Override
    public String toString(){
        return name+"-"+age;
    }
}
public class Main6 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("plice",20));
        list.add(new Student("aob",30));
        list.add(new Student("zharlie",40));
        Collections.sort(list);
        System.out.println("sorted by age "+list);
        list.sort(Comparator.comparing(s->s.name));
        System.out.println("sorted by name "+list);
    }
}
