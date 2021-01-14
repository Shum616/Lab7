package Commands.EditCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.Numbers;

import java.util.Scanner;

public class EditNumber implements Command {
    MotherBase base;

    public EditNumber(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to edit.");
        }
        else {
            base.showAllNumbers();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of number to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > base.getNumberList().size()) {
                System.out.println("\t\t\tEnter the index of number again...  ");
                index = in.nextInt() - 1;
            }
            Numbers num = new Numbers();
            num.createNumber();
            base.getNumberList().set(index, num);
        }
    }
}