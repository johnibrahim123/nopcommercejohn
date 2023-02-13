package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D01_registerStepDef {

    //i will wrie a code  i should import Given from cumammer befor creating the method

    public class Do1_registerStepDef{

        P01_register register=new P01_register();
        @Given("user go to register page")
                public void goRegisterPage()

        {
            register.registerlink().click();
        }
    }

    @Given("user go to register page")
    public void goRegisterPage()
    {
        System.out.println("This is a before start coding");
        WebElement registerBtn=Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        registerBtn.click();
    }
}
