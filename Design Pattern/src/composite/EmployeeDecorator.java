package composite;

import java.util.Date;

public abstract class EmployeeDecorator implements Component{

    protected EmployeeConcrate employee;

    protected EmployeeDecorator(EmployeeConcrate employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }
    }
}

