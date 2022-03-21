package ru.ok.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTittle extends WebDriverConfig {
    @Test
    public void CheckTittleTest() {
        driver.get("https://ok.ru/");
        String tittle = driver.getTitle();
        Assert.assertEquals(
                "Социальная сеть Одноклассники. Общение с друзьями в ОК. Ваше место встречи с одноклассниками",
                tittle);
    }

    @Test
    public void CheckButtonRegister() {
        driver.get("https://ok.ru/");
        WebElement element = driver.
                findElement(By.xpath("//*[@class='external-oauth-login-footer']//a[@data-l='t,register']"));
        element.click();
        String tittle = driver.getTitle();
        Assert.assertEquals("Одноклассники", tittle);

    }
}
