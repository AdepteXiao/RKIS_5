# Практическая работа №5
### Spring MVC
## Цель работы:
Ознакомиться шаблоном MVC в Spring и тем, как он используется при создании web-приложений.
## Общая постановка задачи:

В каждом варианте есть сущность базы данных. Необходимо:

Изменить практическую работу №4 таким образом, чтобы она представляла собой web-приложение.

Web-приложение должно иметь следующие страницы:

1. Главная страница содержит приветствие и ссылки на другие, которые дублируют по функционалу пункты меню из работы №4.
2. Страница просмотра таблицы записей.
3. Страница добавления новой записи в таблицу.
4. Стрница редактирования записи.
5. Страница удаления записи.
6. Страница просмотра записей согласно некоторому критерию (аналогично пункту из практической работы №4).

Помимо этого должны быть осуществлены проверки (не менее двух) входных данных, сопровождающиеся соответствующими диагностическими сообщениями.


## Вариант задания:
Вариант 8: Велосипед

## Сборка и запуск:

Понадобится Maven и jdk версии 17, postgresql 15.4. Переходим в папку проекта и выполняем следующие команды:

Создание базы данных:
```
psql -U postgres -h localhost -f create_db.sql
```
Сборка:
```
sh mvnw package
```
Запуск программы:
```
java -jar target/lab5-0.0.1-SNAPSHOT.jar
```
Смена кодировки в случае некорректного отображения руссих букв:
```
chcp 65001
```
Загруженный сайт находится по адресу:
```
http://localhost:8080
```
