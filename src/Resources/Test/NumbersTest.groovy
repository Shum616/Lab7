package Resources.Test

import Resources.Numbers
import org.junit.Test

class NumbersTest {
    String test1 = "+380";
    int num = 396768;
    int ud = 1;

    Numbers ONE = new Numbers(test1, num, ud);
    @Test
    public void testGetPrefix() {
        Assert.assertEquals(test1, ONE.getPrefix());
    }
    @Test
    public  void testGetNumber() {
        Assert.assertEquals(num, ONE.getNumber());
    }
    @Test
    public  void testGetTariff() {
        Assert.assertEquals(ud, ONE.getTariff());
    }
}
