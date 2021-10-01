class Main {
  public static void main(String[] args) {
    Employee employeeOne = new Employee("John Doe", "Delhi", 35000, 25);
    Employee employeeTwo = new Employee("Don Joe", "Mumbai", 15000, 21);

    employeeTwo.raiseSalary(50);
    
    employeeOne.display();
    System.out.println();
    employeeTwo.display();

  }
}