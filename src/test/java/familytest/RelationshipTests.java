//all tests
package familytest;

import com.rd.family.Man;
import com.rd.family.Person;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RelationshipTests {

    private Woman woman;
    private Person man;
    @BeforeMethod
    public void creatingPerson(){
        man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter" );
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }
    @BeforeMethod
    public void deregisterPartnership() {
        if (woman.getLastName().equals("Smith")) {
            woman.setMaidenName(woman.getMaidenName());
            woman.setLastName(woman.getMaidenName());
        }
    }

    @Test
    public void testGetWomanFirstName() {
        woman.setFirstName("Andrea");
        Assert.assertEquals("Andrea", woman.getFirstName());
    }

    @Test
    public void testGetManFirstName() {
        man.setFirstName("Alex");
        Assert.assertEquals("Alex", man.getFirstName());
    }

    @Test
    public void testSetWomanFirstName() {
        woman.setFirstName("Andrea");
        Assert.assertEquals("Andrea", woman.getFirstName());
    }
    @Test
    public void testSetManFirstName() {
        man.setFirstName("Alex");
        Assert.assertEquals("Alex", man.getFirstName());
    }

    @Test
    public void testGetWomanLastName() {
        woman.setLastName("Larson");
        Assert.assertEquals("Larson", woman.getLastName());
    }

    @Test
    public void testGetManLastName() {
        man.setLastName("Smith");
        Assert.assertEquals("Smith", man.getLastName());
    }

    @Test
    public void testSetWomanLastName() {
        woman.setLastName("Larson");
        Assert.assertEquals("Larson", woman.getLastName());
    }

    @Test
    public void testSetManLastName() {
        man.setLastName("Smith");
        Assert.assertEquals("Smith", man.getLastName());
    }

    @Test
    public void testGetWomanAge() {
        woman.setAge(40);
        Assert.assertEquals(40, woman.getAge());
    }

    @Test
    public void testGetManAge() {
        woman.setAge(65);
        Assert.assertEquals(65, man.getAge());
    }

    @Test
    public void testSetWomanAge() {
        woman.setAge(40);
        Assert.assertEquals(40, woman.getAge());
    }
    @Test
    public void testSetManAge() {
        man.setAge(65);
        Assert.assertEquals(65, man.getAge());
    }

    @Test
    public void testSetPartnerLastName(){
        woman.setPartnerLastName("Smith");
        Assert.assertEquals(woman.getPartnerLastName(),"Smith","Woman didn't get married");

    }

    @Test
    public void testGetPartnerLastName() {
        woman.getPartnerLastName();
        Assert.assertEquals( woman.getPartnerLastName(),"Smith", "Woman doesn't have partner");

    }

    @Test
    public void testGetMaidenName(){
        woman.getMaidenName();
        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman got married");

    }

    @Test
    public void testSetMaidenName(){
        woman.setMaidenName("Larson");
        Assert.assertEquals(woman.getMaidenName(),"Larson","Woman didn't get married");

    }


    @Test
    public void testRegisterPartnership() {
        woman.setPartnerLastName("Smith");

        try {
            Assert.assertEquals("Smith", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women doesn't want to be a wife: " + e.getMessage());
        }
    }

    @Test
    public void testDeRegisterPartnership() {

        try {
            deregisterPartnership();
            Assert.assertEquals("Larson", woman.getLastName());
        } catch (NullPointerException e) {
            Assert.fail("Women already changed her Last Name: " + e.getMessage());
        }
    }

    @Test
    public void testIsRetiredWoman() {
        Assert.assertFalse(woman.isRetired(), "Woman still young");
    }

    @Test
    public void testIsRetiredMan() {
        Assert.assertTrue(man.isRetired(), "Man is retired");
    }

}
