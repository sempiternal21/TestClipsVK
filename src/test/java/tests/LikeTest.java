package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pages.RecomendationClipsPage;
import utils.Authorization;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


/**
 * Тест эмулирует нажатия кнопки "Мне нравится" под клипом
 */
public class LikeTest{
    @Test
    public void likeTest() {
        new Authorization().goToClipsTab();
        RecomendationClipsPage clipsPage = new RecomendationClipsPage();
        clipsPage.clickToLikeButton();
        $(byXpath("(//*[contains(@class, 'active')])[1]")).shouldBe(Condition.visible);
    }
}
