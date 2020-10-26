package diffImplementation.dependency_injection;

public class EmployeeProcessor {

    private EmployeeQueue employeeQueue;

    public EmployeeProcessor(EmployeeQueue employeeQueue) {
        this.employeeQueue = employeeQueue;
    }

    public void process() {
        System.out.println(employeeQueue.get().toString());
    }

}
