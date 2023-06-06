package familytest;
import com.rd.family.Person;
import com.rd.family.Woman;
import com.rd.family.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PersonTest {
    private Woman woman;
    private Man man;
    @BeforeMethod
    public void creatingPerson(){
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter");
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetPersonFirstName() {
        woman.setFirstName("Andrea");
        Assert.assertEquals("Andrea", woman.getFirstName());
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testGetManLastName() {
        man.setLastName("Smith");
        Assert.assertEquals("Smith", man.getLastName());
    }
    @Test(groups = {"AllTests","GettersSetters"})
    public void testSetManAge() {
        man.setAge(65);
        Assert.assertEquals(65, man.getAge());
    }

}
