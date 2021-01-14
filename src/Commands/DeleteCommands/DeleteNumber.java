package Commands.DeleteCommands;

import Commands.Command;
import Resources.MotherBase;

import java.util.Scanner;

public class DeleteNumber implements Command {
    MotherBase base;

    public DeleteNumber(MotherBase base){
        this.base = base;
    }
    public void execute() {
        if(base.getNumberList().isEmpty()){
            System.out.println("\t\t\tNumber list is empty! There is nothing to delete.");
        } else{
            base.showAllNumbers();
            Scanner in = new Scanner(System.in);
            System.out.println("\n\tEnter the index of number to remove: ");
            int i = in.nextInt()-1;
            while(i < 0 || i > base.getNumberList().size()){
                System.out.println("\t\t\tEnter the index of number again...  ");
                i = in.nextInt() -1;
            }
            if (base.getUserList().isEmpty()) {
                ;
            }
            else{
                base.deleteNumbersFromUsers(base.getNumberList().get(i));
            }
            base.getNumberList().remove(i);
        }
    }
}
