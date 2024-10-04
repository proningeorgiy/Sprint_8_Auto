package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    @DisplayName("Проверка имени")
    @Description("Подстановка позитивных тестовых значений")
    public void accountNameTest() {
        String name = "Вася Пупкин";
        Account account = new Account(name);
        boolean checkName;

        checkName = account.checkNameToEmboss();
        checkAccountName(checkName);
    }

    @Step("Проверка позитивного значения")
    public void checkAccountName(boolean checkName) {
        Assert.assertTrue(checkName);
    }
}