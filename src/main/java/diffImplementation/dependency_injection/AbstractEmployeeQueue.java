package diffImplementation.dependency_injection;


import java.util.LinkedList;

public abstract class AbstractEmployeeQueue implements EmployeeQueue {

    protected LinkedList<Employee> queue = new LinkedList<>();

    @Override
    public void add(Employee employee) {
        queue.addFirst(employee);
    }

    @Override
    public void remove(Employee employee) {
        queue.remove(employee);
    }

    @Override
    public abstract Employee get();

}