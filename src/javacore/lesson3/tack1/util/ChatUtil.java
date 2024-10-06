package javacore.lesson3.tack1.util;

import javacore.lesson3.tack1.Chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtil {

    private ChatUtil() {

    }

    public static List<Chat> editChat(List<Chat> list) {
        List<Chat> result = new ArrayList<>();
        for (Iterator<Chat> iterator = list.iterator(); iterator.hasNext(); ) {
            Chat chat = iterator.next();
            if (chat.getCountUser() > 1000) {
                result.add(chat);
            }
        }

        return result;
    }
}
