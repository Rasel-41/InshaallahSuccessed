public class Test {
    public static void main(String[] args) {
        Person person = new Person("Jassi",2002);
        Student student = new Student("Tasnim",2003,"Mathematics");
        Instructor instructor = new Instructor("Sristy",2004,50000);
        System.out.println(person);
        System.out.println(student);
        System.out.println(instructor);
    }
}
