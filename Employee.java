public class Employee{
  private String name;
  private String location;
  private double salary;
  private int age;
  private static int countOfEmployee = 0;

  Employee(String name, String location, double salary, int age){
    this.name = name;
    this.location = location;
    this.salary = salary;
    this.age = age;
    countOfEmployee +=1;
  }

  public static void numberOfEmployee(){
    System.out.print(countOfEmployee);
  }

  // getters
  public double getSalary(){
    return this.salary;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public String getLocation(){
    return this.location;
  }

  // settter;

  public void setSalary(double salary){
    this.salary = salary;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setLocation(String location){
    this.location = location;
  }
  
  public void display(){
    System.out.println("Name: " + getName());
    System.out.println("Location: " + getLocation());
    System.out.println("Salary: " + getSalary());
    System.out.println("Age: "  + getAge());
  }

  public void raiseSalary(double FACTOR){
    this.salary = this.salary*(1 + FACTOR/100);
  }
}