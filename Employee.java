public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double hourlyWage;
    private double hoursWorked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employee(String name, int employeeId, String department, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        double weeklySalary = hourlyWage * hoursWorked;
        return weeklySalary;
    }

    public String toString() {
        return "Employee: " + name + "\n" +
               "Employee ID: " + employeeId + "\n" +
               "Department: " + department + "\n" +
               "Hourly Wage: $" + hourlyWage + "\n" +
               "Hours Worked: " + hoursWorked + "\n" +
               "Weekly Salary: $" + calculateSalary();
    }
}