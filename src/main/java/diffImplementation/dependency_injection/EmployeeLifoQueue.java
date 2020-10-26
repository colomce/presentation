package diffImplementation.dependency_injection;

public class EmployeeLifoQueue extends AbstractEmployeeQueue {
    public Employee get() {
        return queue.getFirst();
    }
}

