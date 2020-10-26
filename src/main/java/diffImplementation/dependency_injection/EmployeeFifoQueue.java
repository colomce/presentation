package diffImplementation.dependency_injection;

public class EmployeeFifoQueue extends AbstractEmployeeQueue {

    public Employee get() {
        return queue.getLast();
    }
}
