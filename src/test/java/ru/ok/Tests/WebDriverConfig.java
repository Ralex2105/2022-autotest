package ru.ok.Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.ok.Utils.User;

public class WebDriverConfig {

    public ChromeDriver driver;
    public String URL = "https://ok.ru/";
    public User user;

    public String LOGIN = ""; //login
    public String PASSWORD = ""; //Password
    public String FULL_NAME = ""; //Your name and lastname
    public String FRIEND_ID = ""; //Id your friend
    public String ID = ""; //your id

    @Before
    public void config() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        user = new User(LOGIN, PASSWORD, FULL_NAME,FRIEND_ID, ID);
    }

    @After
    public void close() {
        driver.quit();
    }
}
