package ru.ok.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestLogIn extends WebDriverConfig {

    @Test
    public void CheckTittleTest() {
        driver.get(URL);

        WebElement username = driver.findElement(By.name("st.email"));
        WebElement password = driver.findElement(By.name("st.password"));

        username.sendKeys(user.getLogin());
        password.sendKeys(user.getPassword());

        driver.findElement(By.xpath("//*[@data-l='t,sign_in']")).click();

        String elementText = driver.
                findElement(By.xpath("//a[@data-l='t,userPage']//*[@class='tico ellip']")).getText();

        Assert.assertEquals(elementText, user.getFull_name());
    }
}
