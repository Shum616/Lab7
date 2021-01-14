package Commands.EditCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.User;

import java.util.Scanner;

public class EditUser implements Command {
    MotherBase base;

    public EditUser(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to edit.");
        }
        else {
            base.showAllUser();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of user to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > base.getUserList().size()) {
                System.out.println("\t\t\tEnter the index of user again...  ");
                index = in.nextInt() - 1;
            }
            User us = new User();
            us.createUser(us);
            base.getUserList().set(index, us);
        }
    }
}