package javacore.lesson3.task2.util;

import javacore.lesson3.task2.Chat;
import javacore.lesson3.task2.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private ChatUtil() {

    }

    public static List<User> mergeUsers(List<Chat> chats) {
        List<User> users = new ArrayList<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() > 18) {
                    users.add(user);
                }
            }
        }
        return users;
    }
    public static Double averageAge(List<User> users) {
        Double sumAge = 0.0;
        for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
            User user = iterator.next();
            sumAge += user.getAge();
        }
        return sumAge / users.size();

    }

}
