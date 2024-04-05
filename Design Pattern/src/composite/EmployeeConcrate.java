package composite;

import java.util.Date;

public class EmployeeConcrate implements Component{
    private String name;

    public EmployeeConcrate (String name) {
        this.name = name;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(getName() + " joined on " + formatDate(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(getName() + " terminated on " + formatDate(terminateDate));
    }

    @Override
    public void doTask() {
        // Unassigned task
    }
}
