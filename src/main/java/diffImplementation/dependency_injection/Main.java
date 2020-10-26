package diffImplementation.dependency_injection;

public class Main {
    public static void main(String[] args) {
        EmployeeFifoQueue fifoQueue = new EmployeeFifoQueue();
        fifoQueue.add(new Employee("Cedric"));
        fifoQueue.add(new Employee("Joseph"));
        fifoQueue.add(new Employee("JC"));
        fifoQueue.add(new Employee("Janelle"));
        fifoQueue.add(new Employee("Charlie"));
        EmployeeProcessor userProcessor = new EmployeeProcessor(fifoQueue);
        userProcessor.process();
    }
}
