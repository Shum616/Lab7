package Commands.SpecialCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.Numbers;
import Resources.Tariffs;
import Resources.User;

import java.util.Scanner;

public class FindUsersOnTariff  implements Command {
    MotherBase base;

    public FindUsersOnTariff(MotherBase base) {
        this.base = base;
    }

    public void execute() {
        System.out.println("\t\t\tAvailable Tariffs: ");
        base.showAllTariff();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter index of tariff: ");
        int tarIndex = in.nextInt() - 1;
        Tariffs tar = (base.getTarifList()).get(tarIndex);
        int Id = tar.getId();
        for (User us : base.getUserList()) {
            for (Numbers num : us.getCurrentNumbers()) {
                if (num.getTariff() == Id) {
                    break;
                }
            }
            us.showUser();
        }
    }
}