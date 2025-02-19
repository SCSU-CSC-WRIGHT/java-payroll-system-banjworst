public class PayrollSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 101, "Engineering", 25.0, 40);
        Employee employee2 = new Employee("Jane Smith", 102, "Marketing", 30.0, 35);
        
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}