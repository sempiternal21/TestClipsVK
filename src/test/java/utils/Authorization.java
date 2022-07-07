package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


/**
 * Класс программно реализовывает страницу https://vk.com/login
 */
public class Authorization {

    private final SelenideElement clipsTab = $(By.xpath("//a[@href='/clips']"));
    public Authorization () {
        open("https://vk.com/");
        $(By.className("FlatButton--primary")).click();
        $(By.name("login")).sendKeys("89117402816");
        $(By.className("vkc__Button__primary")).click();
        $(By.name("password")).sendKeys("Testovijbot2");
        $(By.className("vkc__Button__primary")).click();
        System.out.println("efef");
    }

    public void goToClipsTab () {
        getWebDriver().manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        clipsTab.click();
    }
}
