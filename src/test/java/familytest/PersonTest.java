package familytest;
import com.rd.family.Person;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PersonTest {
    private Person person;
    @BeforeMethod
    public void creatingPerson(){
        person = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetPersonFirstName() {
        person.setFirstName("Alex");
        Assert.assertEquals("Alex", person.getFirstName());
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetManLastName() {
        person.setLastName("Smith");
        Assert.assertEquals("Smith", person.getLastName());
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetManAge() {
        person.setAge(65);
        Assert.assertEquals(65, person.getAge());
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetPartnerLastName() {
        person.getPartnerLastName();
        Assert.assertEquals( person.getPartnerLastName(),"Smith", "This is a man's partner");
    }
}
