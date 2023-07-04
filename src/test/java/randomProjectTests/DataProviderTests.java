package randomProjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTests {
    @Test(dataProvider = "users_for_sign_up", dataProviderClass = TestDataProvider.class)
    public void userSignupTest(User myUser, String testStatus) {
        Assert.assertEquals(testStatus, myUser.userSignUpEngine());
    }
}
