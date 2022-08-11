package cloud.autotests.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class test {

    @Test
     void auth(String login,String password) {
        step("", () -> {
            open("https://lord-s047.lordfilm0.org/");
        });
        step("войти в личный кабинет", () -> {
            $(".btn-login.btn.js-login.to-mob").click();
            $("#login_name").setValue(login);
            $("#login_password").setValue(password);
            $(".login-btn").click();

        });
        step("проверяем что появилось имя личного кабинета", () -> {
            $(".btn-login.btn.js-login.to-mob").shouldBe(visible);
        });
    }

    @Test
     void menu() {
        step("// меню сайта", () -> {
            open("https://lord-s047.lordfilm0.org/");
            $(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
            $(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a")).click();
            $(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")).click();
            $(By.xpath("//*[@id=\"header\"]/div/ul/li[4]/a")).click();
        });
        step("проверяем что в меню есть названия клавиш", () -> {
            $(".hmenu.fx-row.to-mob").shouldHave(text("фильмы"), text("сериалы"), text("мультфильмы"));
        });
}

    @Test
     void serial() {
        step("Выбор сериала по категориям ", () -> {
            open("https://lord-s047.lordfilm0.org/");
            $(".sect-title").click();
            $(".chosen-choices").click();
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[1]/div/div/ul/li[3]")).click();
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/ul")).click();//выбираем жанр
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/div/ul/li[2]")).click();//выбираем страну
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[3]/div[1]/label[2]/span")).click();//выбираем иконку сериалы
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[4]/input[2]")).click();//очищаем все параметры
        });
        step("проверяем что есть строка с текстом выберите жанр", () -> {
            $(".chosen-search-input.default").shouldBe(visible);
        });
    }
    @Test
     void movie() {

        step("найти фильм в поисковой строке", () -> {
            open("https://lord-s047.lordfilm0.org/");
            $("#story").setValue("мы все мертвы").pressEnter();
            $(By.xpath("//*[@id=\"dle-content\"]/div[2]")).click();
        });
        step("проверяем что название фильма совпадает с поиском", () -> {
            $(".fleft-desc.fx-1").shouldHave(text("Мы все мертвы "));
        });
    }



}

