public class Person {
    private String name;
    private int yearOfBirth;
    public Person(String name,int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person name : "+getName()+",Year of birth : "+getYearOfBirth();
    }
}
