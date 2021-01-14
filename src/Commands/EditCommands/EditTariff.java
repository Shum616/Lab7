package Commands.EditCommands;

import Commands.Command;
import Resources.MotherBase;
import Resources.Tariffs;

import java.util.Scanner;

public class EditTariff implements Command {
    MotherBase base;

    public EditTariff(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if (base.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to edit.");
        }
        else {
            base.showAllTariff();
            Scanner in = new Scanner(System.in);
            System.out.println("\t\t\tEnter the index of tariff to edit: ");
            int index = in.nextInt() - 1;
            while (index < 0 || index > base.getTarifList().size()) {
                System.out.println("\t\t\tEnter the index of tariff again...  ");
                index = in.nextInt() - 1;
            }
            Tariffs tar = new Tariffs();
            tar.createTariffs();
            base.getTarifList().set(index, tar);
        }
    }
}
