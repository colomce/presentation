package ioc_container;

public class SpringIoc {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
//        employeeService.updateName("Cedric");
        employeeService.praise();
    }
}
