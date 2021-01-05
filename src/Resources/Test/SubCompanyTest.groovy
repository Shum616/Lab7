package Resources.Test

import Resources.SubCompany
import org.junit.Test

class SubCompanyTest {
     String country = "Ukraine";
     int iD = 1;
    SubCompany one = new SubCompany(country, iD);
    @Test
    void testGetCountry() {
        Assert.assertEquals(country, one.getCountry());
    }
    @Test
    void testGetiD() {
        Assert.assertEquals(iD, one.getiD());
    }
}
