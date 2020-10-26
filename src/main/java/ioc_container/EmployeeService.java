package ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService {
    private final ApplicationContext context =
            new ClassPathXmlApplicationContext("spring-context.xml");
    private Employee employee = context.getBean("employee", Employee.class);

    public void updateName(String name) {
        employee.setName(name);
    }

    public void praise() {
        System.out.println("You did well. " + employee.getName());
    }

}
