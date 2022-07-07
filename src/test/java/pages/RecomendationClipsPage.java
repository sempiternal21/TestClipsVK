package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;



/**
 * Класс программно реализовывает страницу https://vk.com/clips
 */
public class RecomendationClipsPage {
    private final SelenideElement subscriptionButton =
            $(By.className("ShortVideoPost__subscribe"));
    private final SelenideElement likeButton =
            $(By.className("PostBottomActionLikeIcons"));
    private final SelenideElement qrPlayMarketButton =
            $(By.className("ShortVideoStub__qrLink--android"));
    private final SelenideElement vkFestTrendButton =
            $(By.className("ShortVideoTagListItem"));
    private final String appStoreUrl =
            $(byXpath("//*[contains(@class, 'ShortVideoStub__link--iphone')]"))
                    .getAttribute("href");
    public void clickToSubscribeButton () {
        subscriptionButton.click();
    }
    public void clickToLikeButton () {
        likeButton.click();
    }
    public String getAppStoreUrl () {
        return appStoreUrl;
    }
    public void clickToQRPlayMarketButton () {
        qrPlayMarketButton.click();
    }
    public void clickVkFestTrendButton () {
        vkFestTrendButton.click();
    }
}
