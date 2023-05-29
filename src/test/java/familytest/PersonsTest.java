package familytest;

import com.rd.family.Man;
import com.rd.family.Person;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonsTest {
    private Woman woman;
    private Man Man;
    @BeforeMethod
    public void creatingPerson(){
        Man man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter" );
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }
    @Test
    public void testGetPartnerLastName() {
        Assert.assertEquals( woman.getPartnerLastName(),"Smith", "Woman doesn't have partner");

    }

    @Test
    public void testGetMaidenName(){
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");

        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman got married");

    }

    @Test
    public void testSetPartnerLasName(){
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        String partnerLastName = "Smith";
        Assert.assertEquals(woman.setPartnerLasName(),"Larson","Woman didn't get married");

    }


    @Test
    public void testSetMaidenName(){
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        String maidenName = "Larson";

        Assert.assertEquals(woman.setMaidenName("Larson"),"Larson","Woman didn't get married");

    }

    @Test
    public void testIsRetiredWoman() {
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");

        Assert.assertFalse(woman.isRetired(), "Woman still young");

    }

    @Test
    public void testIsRetiredMan() {
        Man man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter" );

        Assert.assertTrue(man.isRetired(), "Man is retired");
    }
}
