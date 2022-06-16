package Homeworktest;

import Runner.ChromRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Class2 extends ChromRunner {
    @Test
    public void Login(){
        $("#firstName").setValue("Gvantsa");
        $("#lastName").setValue("Shanava");
        $("#email").setValue("gvantsa.shanava@gmail.com");
        $("#password").setValue("Gvantsa123");
        $("#confirmPassword").setValue("Gvantsa123");

        sleep(3000);


    }
}
