package Commands.AddCommands;

import Commands.Command;
import Resources.MotherBase;

import java.util.Scanner;

public class AddNumberToUser implements Command {
    MotherBase base;

    public AddNumberToUser(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        base.showAllUser();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter index of user: ");
        int userIndex = in.nextInt() -1;
        base.showAllNumbers();
        System.out.println("\t\t\tEnter index of number to add: ");
        int numberIndex = in.nextInt() -1;
        (base.getUserList().get(userIndex)).AddNumberToUser(base.getNumberList().get(numberIndex));
    }
}
