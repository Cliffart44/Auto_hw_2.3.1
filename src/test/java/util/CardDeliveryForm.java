package util;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.Locale;

@Data
public class CardDeliveryForm {
    Faker faker = new Faker(new Locale("ru"));
    private final String city = faker.address().city();
    private final String fullName = faker.name().fullName().replace("ё", "е");
    private final String phone = faker.phoneNumber().cellPhone().replace("(", "").replace(")", "").replace(".", "").replace("-", "").replace(" ", "");
}