package familytest;
import com.rd.family.Person;
import com.rd.family.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ManTest {
    private Person man;
    @BeforeMethod
    public void creatingMan(){
        man = new Man ("Alex", "Smith", 65, "Andrea", "carpenter", "Larson",null);
    }
    @Test(groups = {"AllTests"})
    public void testIsRetiredMan() {
        Assert.assertTrue(man.isRetired(), "Man is retired");
    }
}
