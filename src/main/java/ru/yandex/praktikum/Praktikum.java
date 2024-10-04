package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        boolean checkName;
        String accountName = "Тимоти Шаламе";

        Account account = new Account(accountName);

        checkName = account.checkNameToEmboss();

        System.out.println("\"" + account.getName() + "\"");
        System.out.println(checkName);
    }
}