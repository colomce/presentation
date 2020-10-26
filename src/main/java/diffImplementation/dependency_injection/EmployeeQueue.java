package diffImplementation.dependency_injection;

public interface EmployeeQueue {
    void add(Employee employee);
    void remove(Employee employee);
    Employee get();
}