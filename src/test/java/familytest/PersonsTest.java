//only getters and setters
package familytest;
import com.rd.family.Person;
import com.rd.family.Woman;
import com.rd.family.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PersonsTest {
    private Person woman;
    private Person man;


    @BeforeMethod
    public void creatingPerson(){
        man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter" );
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
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


}
