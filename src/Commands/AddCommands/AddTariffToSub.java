package Commands.AddCommands;

import Commands.Command;
import Resources.MotherBase;

import java.util.Scanner;

public class AddTariffToSub implements Command {
    MotherBase base;

    public AddTariffToSub(MotherBase base) {
        this.base = base;
    }
    public void execute() {
        if(base.getTarifList().isEmpty()){
            System.out.println("\t\t\tTatiff list is empty! Fill it thirst.");
        } else{
            base.showAllSubcompanies();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of subcompany: ");
            int subIndex = in.nextInt() -1;
            while(subIndex < 0 || subIndex > base.getAllSubcompanies().size()){
                System.out.println("\t\t\tEnter the index of subcompany again...  ");
                subIndex = in.nextInt() -1;
            }
            base.showAllTariff();
            System.out.println("\t\t\tEnter index of tariff to add to subcompany: ");
            int tarIndex = in.nextInt() -1;
            while(tarIndex < 0 || tarIndex > base.getTarifList().size()){
                System.out.println("\t\t\tEnter the index of tariff again...  ");
                tarIndex = in.nextInt() -1;
            }
            (base.getAllSubcompanies().get(subIndex)).getTarifList().add(base.getTarifList().get(tarIndex));
        }
    }
}