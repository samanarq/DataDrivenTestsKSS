package randomProjectTests;

public class User {

    public String fullName;
    public String gender;
    public int age;

    public User(String fullName, String gender, int age){
        this.fullName=fullName;
        this.gender=gender;
        this.age=age;
    }

    public String userSignUpEngine(){
        /*
        * This checks the age
        * */
        String result="pass";
        if(age>99){
            result="fail";
            System.out.println("This data failed!");
        }else {
            System.out.println(fullName + "\t" + gender + "\t" + age);
        }
        return result;
    }

}
