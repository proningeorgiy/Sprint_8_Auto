package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountParamTest {

    private final String name;

    public AccountParamTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] names() {
        return new Object[][]{
                {"ВП"},
                {"Вася Суперпуперпупкин"},
                {" Вася Пупкин"},
                {"ВасяПупкин "},
                {"ВасяПупкин"},
        };
    }

    @Test
    @DisplayName("Проверка имени")
    @Description("Подстановка негативных тестовых значений")
    public void accountNameTest() {
        Account account = new Account(name);
        boolean checkName;

        checkName = account.checkNameToEmboss();
        checkAccountName(checkName);
    }

    @Step("Проверка негативного значения")
    public void checkAccountName(boolean checkName) {
        Assert.assertFalse(checkName);
    }
}