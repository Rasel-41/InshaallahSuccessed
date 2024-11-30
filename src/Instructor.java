public class Instructor extends Person{
    private double salary;
    public Instructor(String name,int yearOfBirth,double salary){
        super(name, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getYearOfBirth() {
        return super.getYearOfBirth();
    }

    public double getSalary() {
        return salary;
    }
    public String toString(){
        return "Instructor name : "+getName()+",Year of birth : "+getYearOfBirth()+",Salary: "+getSalary();
    }
}
