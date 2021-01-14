package Resources.Test

import Resources.MotherBase
import Resources.Numbers
import Resources.SubCompany
import Resources.Tariffs
import Resources.User
import org.junit.Test

class MotherBaseTest {
    MotherBase base = new MotherBase();

    int payment =2;
    int gbPerMonth = 5;
    int minsForCountryOfResidence =3;
    int minsForTheOtherCountries=4;
    int websFee = 1;
    int Id=0;
    ArrayList<String> stocks = new ArrayList<String>();
    Tariffs tar = new Tariffs(payment, gbPerMonth, minsForCountryOfResidence,
            minsForTheOtherCountries, websFee, Id);
    ArrayList<Tariffs> tarif = new ArrayList<Tariffs>();

    String test1 = "+380";
    int num = 396768;
    int ud = 1;
    Numbers ONE = new Numbers(test1, num, ud);
    ArrayList<Numbers> number = new ArrayList<Numbers>();

    String fullName = "Max";
    int iD  = 1;
    private String mail = "mail@gmail.com";
    ArrayList<Numbers> currentNumbers = new ArrayList<Numbers>();
    User other = new User(fullName, iD, mail, currentNumbers);
    ArrayList<User> user = new ArrayList<User>();

    String country = "Ukraine";
    int iD1 = 1;
    SubCompany one = new SubCompany(country, iD);
    ArrayList<User> sub = new ArrayList<User>();

    @Test
    void testGetTarifList() {
        tarif.add(tar)
        base.getTarifList().add(tar);
        Assert.assertEquals(tarif, base.getTarifList());
    }
    @Test
    void testGetUserList() {
        user.add(other);
        base.getUserList().add(other);
        Assert.assertEquals(user, base.getUserList());
    }
    @Test
    void testGetNumberList() {
        number.add(ONE);
        base.getNumberList().add(ONE);
        Assert.assertEquals(number, base.getTarifList());
    }
    @Test
    void testGetAllSubcompanies() {
        sub.add(one);
        base.getAllSubcompanies().add(one);
        Assert.assertEquals(sub, base.getAllSubcompanies());
    }
    @Test
    void testDeleteTariff() {
    }
    @Test
    void testShowAllTariffs() {
    }
    @Test
    void testShowAllUser() {
    }
    @Test
    void testShowAllNumbers() {
    }
    @Test
    void testShowAllSubcompanies() {
    }
    @Test
    void testDeleteTariffFromSub() {
    }
    @Test
    void testDeleteNumbersFromUsers() {
    }
}
