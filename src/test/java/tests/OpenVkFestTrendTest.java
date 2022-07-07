package tests;

import org.junit.jupiter.api.Test;
import pages.RecomendationClipsPage;
import utils.Authorization;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;



/**
 * Тест открывает страницу клипов мероприятия VK Fest
 */
public class OpenVkFestTrendTest{
    @Test
    public void openVkFestTrendTest() {
        new Authorization().goToClipsTab();
        RecomendationClipsPage clipsPage = new RecomendationClipsPage();
        clipsPage.clickVkFestTrendButton();
        webdriver().shouldHave(url(
    "https://vk.com/clips/hashtag/%D0%9C%D0%BE%D0%B9VKFest"));
    }
}
