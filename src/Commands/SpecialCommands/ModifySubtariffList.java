package Commands.SpecialCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.SubCompany;

import java.util.Scanner;

public class ModifySubtariffList implements Command {
    MotherBase base;

    public ModifySubtariffList(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        System.out.println("\t\t\tAvailable Subcompanies: ");
        base.showAllSubcompanies();
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tEnter the index of subcompany: ");
        int subIndex = in.nextInt() -1;
        SubCompany testOne = (base.getAllSubcompanies()).get(subIndex);
        System.out.println("\t\t\tAvailable tariffs: ");
        base.showAllTariff();
        System.out.println("\t\t\tSub tariffs: ");
        testOne.showAllTariff();
        int check = 0;
        while (check <= 2){
            System.out.println("\t\t\tAdd tariff to list or delete one? (1 - add, 2-delete, 3- done): ");
            check = in.nextInt();
            if(check == 1){
                System.out.println("\t\t\tEnter the index of tariff to add: ");
                int index = in.nextInt() -1;
                testOne.getTarifList().add((base.getTarifList()).get(index));
            } if (check == 2) {
                System.out.println("\t\t\tEnter the index of tariff to delete: ");
                int index = in.nextInt() -1;
                testOne.DeleteTariff(index);
            } else{
                break;
            }
        }
    }
}

