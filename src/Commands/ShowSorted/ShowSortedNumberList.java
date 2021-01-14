package Commands.ShowSorted;

import Commands.Command;
import Resources.MotherBase;
import Resources.Numbers;

import java.util.Collections;
import java.util.Scanner;

public class ShowSortedNumberList implements Command {
    MotherBase base;

    public ShowSortedNumberList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        if (base.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by prefix" +
                    "\n\t\t\t 2 - Sort by number" +
                    "\n\t\t\t 3 - Sort by tariff id");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of numbers: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(base.getNumberList(), Numbers.CompareByPrefix);
                    base.showAllNumbers();
                    break;
                case 2:
                    Collections.sort(base.getNumberList(), Numbers.CompareByNumber);
                    base.showAllNumbers();
                    break;
                case 3:
                    Collections.sort(base.getNumberList(), Numbers.CompareByTariffId);
                    base.showAllNumbers();
                    break;
                default:
                    System.out.println("Something is wrong :(");
            }
        }
    }
}
