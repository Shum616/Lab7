package Commands.ShowAllCommands;

import Commands.Command;
import Resources.MotherBase;

public class ShowAllSubCompanies implements Command {
    MotherBase base;

    public ShowAllSubCompanies(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.showAllSubcompanies();
    }
}
