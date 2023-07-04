package randomProjectTests;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "users_for_sign_up")
    public static Object[][] getUserDetailsForSignupAndTestStatus() {
        return new Object[][]{
                {new User("Jane Doe", "Female", 21), "pass"},
                {new User("Jon Doe", "Male", 23), "pass"},
                {new User("Johnny Bravo", "Male", 100), "fail"},
        };
    }
}
