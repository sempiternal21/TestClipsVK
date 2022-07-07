package tests;

import org.junit.jupiter.api.Test;
import pages.RecomendationClipsPage;
import utils.Authorization;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;


/**
 * Тест эмулирует открытие модального окна магазина Play Market
 */
public class OpenQRPlayMarketTest{
    @Test
    public void openAppStoreTest() {
        new Authorization().goToClipsTab();
        RecomendationClipsPage clipsPage = new RecomendationClipsPage();
        clipsPage.clickToQRPlayMarketButton();
        $(byClassName("ShortVideoStubPopup")).shouldBe(exist);
    }
}
