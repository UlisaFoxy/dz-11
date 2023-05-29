package familytest;

import com.rd.family.Person;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RelationshipTests {

    private static Object maidenName;
    private Woman woman;
    @BeforeMethod
    public void setup() {
        Person Woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }
    private void registerPartnership(Woman woman) {
        if (woman.getPartner() != null) {
            woman.setLastName(woman.getPartnerLastName());
        }
    }

    @Test
    public void testRegisterPartnership() {
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        woman.setPartnerLastName("Smith");

        try {
            registerPartnership(woman);
            Assert.assertEquals("Smith", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women doesn't want to be a wife: " + e.getMessage());
        }
    }

    @BeforeMethod
    public static void deregisterPartnership(Woman woman) {
        if (woman.getLastName() == "Smith") {
            woman.setMaidenName(woman.getMaidenName());
            woman.setLastName(woman.getMaidenName());
        }
    }

    @Test
    public void testDeRegisterPartnership() {
        Woman woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");

        try {
            deregisterPartnership(woman);
            Assert.assertEquals("Larson", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women already changed her Last Name: " + e.getMessage());
        }
    }

}
