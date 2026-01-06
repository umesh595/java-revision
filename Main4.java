class Person {
 int age;
 String name;
 Person(String name,int age){
      this.name=name;
      this.age=age;
 }
 void greet(){
    System.out.println("hello i am "+name+" and i am "+age+" years old");
 }
 public static void main(String[] args) {
     Person p=new Person("Alice",20);
     p.greet();
 }}