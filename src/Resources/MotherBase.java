package Resources;

import java.io.Serializable;
import java.util.ArrayList;

public class MotherBase implements Serializable {
    private final ArrayList<Tariffs> tarifList = new ArrayList<Tariffs>();
    private final ArrayList<User> userList = new ArrayList<User>();
    private final ArrayList<Numbers> numberList = new ArrayList<Numbers>();
    private final ArrayList<SubCompany> subcompaniesList = new ArrayList<SubCompany>();

    public ArrayList<Tariffs> getTarifList() { return tarifList; }
    public ArrayList<User> getUserList() { return userList; }
    public ArrayList<Numbers> getNumberList() { return numberList; }
    public ArrayList<SubCompany> getAllSubcompanies() { return subcompaniesList; }

    public void DeleteTariff(int i) {
        if (this.getAllSubcompanies().isEmpty()) {
            ;
        } else {
            this.deleteTariffFromSub(this.tarifList.get(i));
        }
        this.tarifList.remove(i - 1);
    }

    public void showAllTariff(){
        if (this.getTarifList().isEmpty()) {
            System.out.println("\t\t\tTariff list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll available tariffs:");
            int i = 0;
            for(Tariffs tar : this.getTarifList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                tar.showTariff();
                i++;
            }
        }
    }
    public void showAllUser(){
        if (this.getUserList().isEmpty()) {
            System.out.println("\t\t\tUser list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll users:");
            int i = 0;
            for(User us : this.getUserList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                us.showUser();
                i++;
            }
        }
    }
    public void showAllNumbers(){
        if (this.getNumberList().isEmpty()) {
            System.out.println("\t\t\tNumber list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll numbers:");
            int i = 0;
            for(Numbers num : this.getNumberList()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                num.showNumber();
                i++;
            }
        }
    }
    public void showAllSubcompanies(){
        if (this.getAllSubcompanies().isEmpty()) {
            System.out.println("\t\t\tSuncompanies list is empty! There is nothing to show.");
        }
        else{
            System.out.printf("\n\tAll subcompanies:");
            int i = 0;
            for(SubCompany sub : this.getAllSubcompanies()) {
                System.out.printf("\n\t\t\t%d) ", i+1);
                sub.showSubcompany();
                i++;
            }
        }
    }

    public void deleteTariffFromSub(Tariffs tar){
        for( SubCompany sub: this.getAllSubcompanies()) {
            for (Tariffs tested : sub.getTarifList()) {
                if (tested.getId() == tar.getId()) {
                    sub.getTarifList().remove(tested);
                    break;
                }
            }
        }
    }

    public void deleteNumbersFromUsers(Numbers num){
        for( User use: this.getUserList()) {
            for (Numbers tested : use.getCurrentNumbers()) {
                if (tested.getNumber() == num.getNumber()) {
                    use.getCurrentNumbers().remove(tested);
                    break;
                }
            }
        }
    }
}

