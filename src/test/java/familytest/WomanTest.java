package familytest;
import com.rd.family.Person;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest {
    private Person woman;
    @BeforeMethod
    public void creatingPerson(){
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }
    @BeforeMethod
    public void deregisterPartnership() {
        if (woman.getLastName().equals("Smith")) {
            woman.setMaidenName(woman.getMaidenName());
            woman.setLastName(woman.getMaidenName());
        }
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetPartnerLastName(){
        woman.setPartnerLastName("Smith");
        Assert.assertEquals(woman.getPartnerLastName(),"Smith","Woman didn't get married");
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetMaidenName(){
        woman.getMaidenName();
        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman got married");
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetMaidenName(){
        woman.setMaidenName("Larson");
        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman didn't get married");
    }
    @Test(groups = {"AllTests"})
    public void testRegisterPartnership() {
        woman.setPartnerLastName("Smith");
        try {
            Assert.assertEquals("Larson", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women doesn't want to be a wife: " + e.getMessage());
        }
    }
    @Test(groups = {"AllTests"})
    public void testDeRegisterPartnership() {
        try {
            deregisterPartnership();
            Assert.assertEquals("Larson", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women already changed her Last Name: " + e.getMessage());
        }
    }
    @Test(groups = {"AllTests"})
    public void testIsRetiredWoman() {
        Assert.assertFalse(woman.isRetired(), "Woman still young");
    }


}

