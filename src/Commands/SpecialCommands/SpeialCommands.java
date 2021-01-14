package Commands.SpecialCommands;

import Commands.Command;
import Commands.SpecialCommands.FindTariffByPayment;
import Commands.SpecialCommands.FindUsersOnTariff;
import Commands.SpecialCommands.FindUsersTariffById;
import Resources.MotherBase;

import java.util.Scanner;

public class SpeialCommands {
    private final Command findTariffByPayment;
    private final Command findUsersOnTariff;
    private final Command findUsersTariffById;
    private final Command modifySubtariffList;

    public SpeialCommands(MotherBase base) {
        this.findTariffByPayment = new FindTariffByPayment(base);
        this.findUsersOnTariff =new FindUsersOnTariff(base);
        this.findUsersTariffById =new FindUsersTariffById(base);
        this.modifySubtariffList =new ModifySubtariffList(base);
    }

    public boolean chooseCommand() {
        System.out.print("\t1 - find tariff by payment\n"
                + "\t2 - find users on tariff\n"
                + "\t3 - find user`s tariff by id\n"
                + "\t4 - find user`s tariff by id\n"
                + "\t5 - return\n\t");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                findTariffByPayment();
                break;
            case 2:
                findUsersOnTariff();
                break;
            case 3:
                findUsersTariffById();
                break;
            case 4:
                modifySubtariffList();
                break;
            default:
                return false;
        }
        return true;
    }

    private void findTariffByPayment() { findTariffByPayment.execute(); }
    private void findUsersOnTariff() { findUsersOnTariff.execute(); }
    private void findUsersTariffById() { findUsersTariffById.execute(); }
    private void modifySubtariffList() { modifySubtariffList.execute(); }
}
