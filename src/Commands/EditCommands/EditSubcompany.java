package Commands.EditCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.SubCompany;

import java.util.Scanner;

public class EditSubcompany implements Command {
    MotherBase base;

    public EditSubcompany(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to edit.");
        }
        else {
            base.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of subcompany to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > base.getAllSubcompanies().size()) {
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                index = in.nextInt() - 1;
            }
            SubCompany sub = new SubCompany();
            sub.createSubcompany();
            base.getAllSubcompanies().set(index, sub);
        }
    }
}