package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        Component employee = new EmployeeConcrate("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        Component teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        Component manager = new TeamManager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        Component teamLeaderAndManager = new TeamManager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}