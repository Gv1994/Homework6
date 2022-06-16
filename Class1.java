package Homeworktest;

import Runner.ChromRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Class1 extends ChromRunner {
    @Test
    public void Registration(){
        $("#firstName").click();
        $("#lastName").click();
        Assert.assertEquals("სახელი სავალდებულოა",$(".text-danger").getText());
        sleep(5000);

    }
}
