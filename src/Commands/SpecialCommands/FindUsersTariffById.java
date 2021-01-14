package Commands.SpecialCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.Numbers;
import Resources.Tariffs;
import Resources.User;

import java.util.Scanner;

public class FindUsersTariffById implements Command {
    MotherBase base;

    public FindUsersTariffById(MotherBase base){
        this.base = base;
    }
    public void execute() {
        base.showAllUser();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter number index  of user: ");
        int userIndex = in.nextInt() -1;
        User newOne = base.getUserList().get(userIndex);
        System.out.println("\t\t\tEnter his or her number index: ");
        int numberIndex = in.nextInt() -1;
        Numbers testOne = (newOne.getCurrentNumbers()).get(numberIndex);
        int check = 0;
        for(Tariffs tar : base.getTarifList()) {
            if (testOne.getTariff() == tar.getId()) {
                System.out.println("\t\t\tUsers` tariff: ");
                tar.showTariff();
                break;
            }
            else {
                ;
            }
        }
    }
}

