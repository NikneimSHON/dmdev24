package javacore.lesson3.tack1;

import javacore.lesson3.tack1.comparator.ComparatorCountUser;
import javacore.lesson3.tack1.util.ChatUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatDemo {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<Chat>();
        chats.add(new Chat("Vk", 990));
        chats.add(new Chat("Telegram", 1250));
        chats.add(new Chat("University", 2000));
        chats.add(new Chat("Avito", 19000));

        chats = ChatUtil.editChat(chats);
        System.out.println(chats);

        chats.sort(new ComparatorCountUser());
        System.out.println(chats);

        Collections.sort(chats);
        System.out.println(chats);

    }
}
