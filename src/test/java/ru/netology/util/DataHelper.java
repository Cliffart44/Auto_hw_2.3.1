package ru.netology.util;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private DataHelper() {
    }

    private static final Faker faker = new Faker(new Locale("ru"));
    private static final String city = faker.address().cityName().replace("Новокузнецк", "Курск").replace("Сочи", "Тула");
    private static final String anotherCity = faker.address().cityName().replace("Новокузнецк", "Курск").replace("Сочи", "Тула");
    private static final String lattermostCity = faker.address().cityName().replace("Новокузнецк", "Курск").replace("Сочи", "Тула");
    private static final String surname = faker.name().lastName().replace("ё", "е");
    private static final String name = faker.name().firstName().replace("ё", "е");
    private static final String fullName = surname + " " + name;
    private static final String phone = faker.phoneNumber().phoneNumber().replace("+", "").replace("(", "").replace(")", "").replace("-", "");

    public static String when(boolean reschedule) {
        long daysToAdd = 7;
        if (reschedule)
            return LocalDate.now().plusDays(daysToAdd + 2).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        else return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
    }

    public static String getCity() {
        return city;
    }

    public static String getAnotherCity() {
        return anotherCity;
    }

    public static String getLattermostCity() {
        return lattermostCity;
    }

    public static String getFullName() {
        return fullName;
    }

    public static String getPhone() {
        return phone;
    }
}