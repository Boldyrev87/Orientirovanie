package ru.netology.testirovanie;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Анатолий";
        post.passport = "1206123456";
        post.patronymic = "+Олегович";
        post.phone = "+79086110101";
        post.surname = "Болдырев";
        post.subscription = true;
        post.birthday.day = 8;
        post.birthday.month = 9;
        post.birthday.year = 1987;
    }
}
