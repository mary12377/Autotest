# Проект по автоматизации тестирования сайта с фильмами
## <a target="_blank" href="https://doramalive.ru/">Сайт DoramaLive</a>
![Dorama](images/Dorama.png)

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>


## :computer: Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.png">
<img width="6%" title="Java" src="images/Java.png">
<img width="6%" title="Gradle" src="images/Gradle.png">
<img width="6%" title="JUnit5" src="images/JUnit5.png">
<img width="6%" title="Selenide" src="images/Selenide.png">
<img width="6%" title="Selenoid" src="images/Selenoid.png">
<img width="6%" title="Allure Report" src="images/Allure_Report.png">
<img width="6%" title="Jenkins" src="images/Jenkins.png">
<img width="6%" title="GitHub" src="images/Github.png">
<img width="6%" title="Telegram" src="images/Telegram.png">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- [x] появилось имя личного кабинета
- [x] в меню есть названия клавиш
- [x] название фильма совпадает с поиском
- [x] заголовок страницы должен содержать текст заголовка 'Дорамы смотреть онлайн на Dorama live'
- [x] журнал консоли страницы не должен содержать ошибок


## :electric_plug: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/taecher-iTerkin-qa_guru_12_13/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins-dashboard.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dremote=${REMOTE}
-Dbrowser=${BROWSER}
```

## :open_book: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure-main-page.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure-test-page.png">
</p>

## :robot: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/TELEGRAM-BOT.png">
</p>

## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test-run.gif">

## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test-run.gif">
</p>

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
