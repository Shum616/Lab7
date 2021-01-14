package Commands.SpecialCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.Tariffs;

import java.util.Scanner;

public class FindTariffByPayment implements Command {
    MotherBase base;

    public FindTariffByPayment(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter minimal payment: ");
        int min = in.nextInt();
        System.out.println("\t\t\tEnter maximum payment: ");
        int max = in.nextInt();
        for(Tariffs tar : base.getTarifList()) {
            if (tar.getPayment() >= min && tar.getPayment() <= max) {
                tar.showTariff();
            }
        }
    }
}
