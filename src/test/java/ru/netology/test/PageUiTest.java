package ru.netology.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static ru.netology.util.DataHelper.*;

public class PageUiTest {

    @Test
    void shouldResubmitRequest() {
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue(getCityInternally());
        $("[data-test-id=date] [placeholder='Дата встречи']").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE, when(0));
        $("[data-test-id=name] [name=name]").setValue(getFullName());
        $("[data-test-id=phone] [name=phone]").setValue(getPhone());
        $("[data-test-id=agreement]>.checkbox__box").click();
//        sleep(2000); // For the good of test's sustainability in head mode
        $(".grid-col .button__text").click();
//        sleep(1000); // For the good of test's sustainability in head mode
        $("[data-test-id='success-notification']>.notification__content").shouldBe(visible).shouldHave(text("Встреча успешно запланирована на " + when(0)));
        $("[data-test-id=date] [placeholder='Дата встречи']").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE, when(2));
        $(".grid-col .button__text").click();
        $("[data-test-id='replan-notification'] .button__text").click();
        $("[data-test-id='success-notification']>.notification__content").shouldBe(visible).shouldHave(text("Встреча успешно запланирована на " + when(2)));
    }
}