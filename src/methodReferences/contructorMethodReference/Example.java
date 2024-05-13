package methodReferences.contructorMethodReference;

public class Example {
    public static void main(String[] args) {

        // Student is a class
        // Provider has a method getStudent() jo ki student ka object return krega , and usko implement krna hai apan ko
        // ye ese hi hota hai ratt lo
        // ye likhne se Provider interface ke method ko Student class ke constructor se refer kr diya.
        Provider provider = Student::new;

        // Toh yaha call provider.getStudent(); hua hai but vo Student class ke constructor ko refer kr rha hai toh constructor call hua hai.
        Student student=provider.getStudent();
        student.dispay();


    }
}
 class Student {

    Student(){
        System.out.println("calling constructor of student class ");
    }
    public void dispay(){
        System.out.println("I am student");

    }
}

@FunctionalInterface
interface Provider {
    public Student getStudent();

}
