package Commands.ShowAllCommands;

import Commands.Command;
import Resources.MotherBase;

public class ShowAllTariffs implements Command {
    MotherBase base;

    public ShowAllTariffs(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.showAllTariff();
    }
}
