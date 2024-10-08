package javacore.lesson3.task2;
import javacore.lesson3.task2.util.ChatUtil;

import java.util.ArrayList;
import java.util.List;

/**
 Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
 будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 Задача:
 Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class ChatDemo {
    public static void main(String[] args) {
        User user1 = new User(1, "David", 28);
        User user2 = new User(2, "Eva", 12);
        User user3 = new User(3, "Frank", 14);

        List<User> movieUserList = new ArrayList<>();
        movieUserList.add(user1);
        movieUserList.add(user2);
        movieUserList.add(user3);

        Chat movieChat = new Chat("Movie Lovers", movieUserList);

        User user4 = new User(7, "Jack", 27);
        User user5 = new User(8, "Kathy", 10);
        User user6 = new User(9, "Liam", 33);

        List<User> techUserList = new ArrayList<>();
        techUserList.add(user4);
        techUserList.add(user5);
        techUserList.add(user6);

        Chat techChat = new Chat("Tech Talk", techUserList);

        List<Chat> chats = new ArrayList<>();
        chats.add(techChat);
        chats.add(movieChat);

        List<User> users = ChatUtil.mergeUsers(chats);
        System.out.println(users);

        Double AverageAge = ChatUtil.averageAge(users);
        System.out.println(AverageAge);



    }
}
