package tests;

import org.junit.jupiter.api.Test;
import pages.RecomendationClipsPage;
import utils.Authorization;

import static org.junit.jupiter.api.Assertions.assertEquals;



/**
 * Тест проверяет корректность ссылки на магазин App Store
 */
public class OpenAppStoreTest{
    @Test
    public void openAppStoreTest() {
        new Authorization().goToClipsTab();
        RecomendationClipsPage clipsPage = new RecomendationClipsPage();
        assertEquals("https://apps.apple.com/ru/app/id1615733452",
                clipsPage.getAppStoreUrl());
    }
}
