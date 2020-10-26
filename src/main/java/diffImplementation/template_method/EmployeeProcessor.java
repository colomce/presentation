package diffImplementation.template_method;

public class EmployeeProcessor extends DatabaseEntityProcessor{
    @Override
    protected void getEntityData() {
        System.out.println("Employee data fetched.");
    }

    @Override
    protected void createEntity() {
        System.out.println("Employee created!");
    }

    @Override
    protected void validateEntity() {
        System.out.println("Employee ok for db persist");
    }

    @Override
    protected void persistEntity() {
        System.out.println("Employee persisted!");
    }
}
