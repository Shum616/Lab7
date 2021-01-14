package Commands.ShowSorted;

import Commands.Command;
import Resources.MotherBase;
import Resources.User;

import java.util.Collections;
import java.util.Scanner;

public class ShowSortedUserList implements Command {
    MotherBase base;

    public ShowSortedUserList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        if (base.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by id" +
                    "\n\t\t\t 2 - Sort by name");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of users: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(base.getUserList(), User.CompareById);
                    base.showAllUser();
                    break;
                case 2:
                    Collections.sort(base.getUserList(), User.CompareByName);
                    base.showAllUser();
                    break;
                default:
                    System.out.println("\nSomething is wrong :(");
            }
        }
    }
}