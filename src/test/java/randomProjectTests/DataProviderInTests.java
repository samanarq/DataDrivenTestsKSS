package randomProjectTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTests {
    @DataProvider(name = "users_for_sign_up")
    public static Object[][] getUserDetails() {
        return new Object[][]{
                {new User("Jane Doe", "Female", 21)},
                {new User("Jon Doe", "Male", 23)},
                {new User("Johnny Bravo", "Male", 100)},
        };
    }

    @Test(dataProvider = "users_for_sign_up")
    public void userSignupTest_InTest(User myUser) {
//        System.out.println(myUser.fullName + "\t" + myUser.gender + "\t" + myUser.age);
        myUser.userSignUpEngine();
    }
}
