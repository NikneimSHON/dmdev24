package javacore.lesson3.task2;

import java.util.List;

public class Chat implements Comparable<Chat> {
    private final String name;
    private final List<User> users;

    public Chat(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat [name=" + name + ", users=" + users + "]";
    }
}


