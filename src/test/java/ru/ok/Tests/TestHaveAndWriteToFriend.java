package ru.ok.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestHaveAndWriteToFriend extends WebDriverConfig {

    @Test
    public void TestHaveAndWriteFriend() {
        driver.get(URL);

        WebElement username = driver.findElement(By.name("st.email"));
        WebElement password = driver.findElement(By.name("st.password"));

        username.sendKeys(user.getLogin());
        password.sendKeys(user.getPassword());

        driver.findElement(By.xpath("//*[@data-l='t,sign_in']")).click();


        driver.findElement(By.xpath("//*[@id='hook_Block_HeaderTopFriendsInToolbar']")).click();


        String buttonWrite = driver.findElement(By.
                xpath("//*[@class='user-grid-card']//*[@href=\"/messages/" + user.getFriendID() + "\"]")).getText();
        Assert.assertEquals("Написать", buttonWrite);
    }


}
