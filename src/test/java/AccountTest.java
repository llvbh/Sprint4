import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;

    public AccountTest(String name){
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][] {
                {"Nazym Seitbekova"},
                {"Na"},
                {"Nazym SeitbekovaSeitbekovaSeitbekovaSeitSeitbekovaSeitbekovaSeitbekovabekova"},
                {"  Nazym   Seitbekova"},
                {"Nazym Seitbekova  "},
                {"Nazym     Seitbekova"},
                {""}
        };
    }
    @Test
    public void checkAccount(){
        Account account = new Account(name);
        Assert.assertEquals("Имя не соответстуют требованиям", true, account.checkNameToEmboss());
    }
}
