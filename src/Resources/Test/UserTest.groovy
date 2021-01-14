package Resources.Test

import Resources.Numbers
import Resources.User
import org.junit.Test


//
class UserTest {
    String fullName = "Max";
    int iD  = 1;
    private String mail = "mail@gmail.com";
    ArrayList<Numbers> currentNumbers = new ArrayList<Numbers>();
    User other = new User(fullName, iD, mail, currentNumbers);
    Numbers a = new Numbers("380", 123, 1);
    Numbers b = new Numbers("30", 234, 2);
    User other1 = new User();


    @Test
    void testGetFullName() {
        Assert.assertEquals(fullName, other1.getFullName());
    }
    @Test
    void testGetiD() {
        Assert.assertEquals(iD, other.getiD());
    }
    @Test
    void testGetCurrentNumbers() {
        currentNumbers.add(a);
        currentNumbers.add(b);
        other.getCurrentNumbers().add(a);
        other.getCurrentNumbers().add(b);
        Assert.assertEquals(currentNumbers,  other.getCurrentNumbers());
    }
    @Test
    void testCreateUser() {

    }
    @Test
    void testAddNumberToUser() {
    }
    @Test
    void testFindUsersTariff() {
    }
}
