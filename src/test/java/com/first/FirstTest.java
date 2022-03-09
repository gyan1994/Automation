package com.first;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class FirstTest {

    @Given("^Test giving$")
    public void test_giving() {
        System.out.println("Hello Cucumber");
        WebDriverManager.phantomjs().setup();
        WebDriver driver=new PhantomJSDriver();
        driver.get("https://www.google.com");
    }
}
