class Main {
  public static void main(String[] args) {
    Employee employeeOne = new Employee("John Doe", "Delhi", 35000, 25);
    Employee employeeTwo = new Employee("Don Joe", "Mumbai", 15000, 21);

    System.out.println();
    System.out.println("Employee Details: ");

    employeeOne.display();
    System.out.println();
    employeeTwo.display();
    System.out.println();
    System.out.println("Salary raise to empoyeeTwo by 40%");
    employeeTwo.raiseSalary(40);
    System.out.println();
    System.out.println("Salary After Raise: ");

    System.out.println(employeeOne.getName() + ": " + employeeOne.getSalary());
    System.out.println(employeeTwo.getName() + ": " + employeeTwo.getSalary());
  }
} 