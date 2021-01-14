package Commands.DeleteCommands;

import Commands.Command;
import Resources.MotherBase;

import java.util.Scanner;

public class DeleteSubcompany implements Command {
    MotherBase base;

    public DeleteSubcompany(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if(base.getAllSubcompanies().isEmpty()){
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to delete.");
        } else{
            base.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\n\tEnter the index of subcompany to remove: ");
            int test = in.nextInt()-1;
            while(test < 0 || test > base.getAllSubcompanies().size()){
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                test = in.nextInt() -1;
            }
            base.getAllSubcompanies().remove(test);
        }
    }
}
