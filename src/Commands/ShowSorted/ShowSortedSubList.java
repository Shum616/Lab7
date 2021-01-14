package Commands.ShowSorted;

import Commands.Command;
import Resources.MotherBase;
import Resources.SubCompany;

import java.util.Collections;
import java.util.Scanner;

public class ShowSortedSubList implements Command {
    MotherBase base;

    public ShowSortedSubList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        if (base.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSubcompanies list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by country" +
                    "\n\t\t\t 2 - Sort by id");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of subcompany: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(base.getAllSubcompanies(), SubCompany.CompareByCountry);
                    base.showAllSubcompanies();
                    break;
                case 2:
                    Collections.sort(base.getAllSubcompanies(), SubCompany.CompareById);
                    base.showAllSubcompanies();
                    break;
                default:
                    System.out.println("\nSomething is wrong :(");
            }
        }
    }
}
