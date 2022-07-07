package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pages.RecomendationClipsPage;
import utils.Authorization;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


/**
 * Тест эмулирует подписку на автора клипа
 */
public class SubscribeTest{
    @Test
    public void subscribeTest() {
        new Authorization().goToClipsTab();
        RecomendationClipsPage clipsPage = new RecomendationClipsPage();
        clipsPage.clickToSubscribeButton();
        $(byXpath("(//*[contains(@class, 'ShortVideoPost__subscribe')])[1]"))
                .shouldBe(Condition.text("Вы подписаны"));
    }
}
