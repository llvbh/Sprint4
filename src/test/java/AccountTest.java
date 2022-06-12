import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;

    public AccountTest(String name){
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][] {
                {"Na"},
                {"Nazym SeitbekovaSeitbekovaSeitbekovaSeitSeitbekovaSeitbekovaSeitbekovabekova"},
                {"  Nazym   Seitbekova"},
                {"Nazym Seitbekova  "},
                {"Nazym     Seitbekova"},
                {""}
        };
    }
    @Test
    public void checkAccountWithIncorrectValues(){
        Account account = new Account(name);
        Assert.assertEquals("Имя не соответстуют требованиям", false, account.checkNameToEmboss());
    }
    @Test
    public void checkAccount(){
        name = "Nazym Seitbekova";
        Account account = new Account(name);
        Assert.assertEquals("Карта скоро будет готова", true, account.checkNameToEmboss());
    }

}
