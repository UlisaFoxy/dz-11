package familytest;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest {
    private Woman woman;

    @BeforeMethod
    public void creatingPerson(){
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }

    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetPartnerLastName(){
        woman.setPartnerLastName("Smith");
        Assert.assertEquals(woman.getPartnerLastName(),"Smith","Woman didn't get married");
    }
    @Test(groups = {"AllTests"})
    public void testRegisterPartnership() {
        woman.setPartnerLastName("Smith");
        Assert.assertEquals(woman.getLastName(),"Larson","Women doesn't want to be a wife");
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetMaidenName(){
        woman.setMaidenName("Larson");
        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman didn't get married");
    }
    @Test(groups = {"AllTests"})
    public void testIsRetiredWoman() {
        Assert.assertFalse(woman.isRetired(), "Woman still young");
    }
}

