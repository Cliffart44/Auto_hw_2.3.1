import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import util.CardDeliveryForm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class PageUiTest {
    CardDeliveryForm form = new CardDeliveryForm();

    private String when(boolean reschedule) {
        long daysToAdd = 7;
        if (reschedule)
            return LocalDate.now().plusDays(daysToAdd + 2).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        else return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
    }

    @Test
    void shouldResubmitRequest() {
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue(form.getCity());
        $$(".input__menu .menu-item__control").first().click();
        $("[data-test-id=date] [placeholder=\"Дата встречи\"]").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE, when(false));
        $("[data-test-id=name] [name=name]").setValue(form.getFullName());
        $("[data-test-id=phone] [name=phone]").setValue(form.getPhone());
        $("[data-test-id=agreement]>.checkbox__box").click();
        $$("button .button__text").findBy(text("Запланировать")).click();
        $$("[data-test-id=\"success-notification\"]>.notification__content").findBy(text("Встреча успешно запланирована на " + when(false))).shouldBe(visible);
        $("[data-test-id=date] [placeholder=\"Дата встречи\"]").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE, when(true));
        $$("button .button__text").findBy(text("Запланировать")).click();
        $$("button .button__text").findBy(text("Перепланировать")).click();
        $$("[data-test-id=\"success-notification\"]>.notification__content").findBy(text("Встреча успешно запланирована на " + when(true))).shouldBe(visible);
    }
}