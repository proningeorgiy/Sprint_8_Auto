# Яндекс Практикум. Финальный проект 8 спринта по автоматизации

## В проекте используются: Java 11, Maven 3.9.6, JUnit 4.13.2, Mockito 3.12.4, Byte Buddy 1.11.16, Jacoco 0.8.7, AspectJ 1.9.7, Allure 2.10.0, REST Assured 5.5.09

### запуск тестирования

```bash
mvn clean test
```

### запуск для оценки покрытия тестов Jacoco

```bash
mvn clean verify
```

### запуск для отчета Allure

```bash
mvn allure:serve
```