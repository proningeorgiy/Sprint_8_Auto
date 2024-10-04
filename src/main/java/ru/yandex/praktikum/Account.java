package ru.yandex.praktikum;

import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        boolean checkName;

        System.out.println("\"" + name + "\"");

        if (getName().length() >= 3 && getName().length() <= 19
                && !getName().startsWith(" ") && !getName().endsWith(" ")
                && StringUtils.countMatches(getName(), " ") == 1)
            checkName = true;
        else
            checkName = false;

        System.out.println(checkName);

        return checkName;
    }
}