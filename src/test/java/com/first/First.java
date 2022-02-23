package com.first;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    @Given("^Test giving$")
    public void test_giving() {
        System.out.println("Hello Cucumber");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
