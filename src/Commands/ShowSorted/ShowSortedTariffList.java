package Commands.ShowSorted;

import Commands.Command;
import Resources.MotherBase;
import Resources.Tariffs;

import java.util.Collections;
import java.util.Scanner;

public class ShowSortedTariffList implements Command {
    MotherBase base;

    public ShowSortedTariffList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        if (base.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to sort.");
        }
        else {
            System.out.println("\n\t\t\t 1 - Sort by payment" +
                    "\n\t\t\t 2 - Sort by Gb" +
                    "\n\t\t\t 3 - Sort by fee");
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the parameter to sort list of tariffs: ");
            switch (in.nextInt()) {
                case 1:
                    Collections.sort(base.getTarifList(), Tariffs.CompareByPayment);
                    base.showAllTariff();
                    break;
                case 2:
                    Collections.sort(base.getTarifList(), Tariffs.CompareByGb);
                    base.showAllTariff();
                    break;
                case 3:
                    Collections.sort(base.getTarifList(), Tariffs.CompareByFee);
                    base.showAllTariff();
                    break;
                default:
                    System.out.println("Something is wrong :(");
            }
        }
    }
}
