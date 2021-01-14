package Commands.AddCommands;


import Resources.MotherBase;
import Resources.Numbers;
import Commands.*;

public class AddNumber implements Command {
    MotherBase base;

    public AddNumber(MotherBase base) {
        this.base = base;
    }

    public void execute() {
        Numbers num = new Numbers();
        num.createNumber();
        base.getNumberList().add(num);
    }
}
