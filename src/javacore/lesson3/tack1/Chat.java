package javacore.lesson3.tack1;

import java.util.Comparator;

public class Chat implements Comparable<Chat> {
    private String name;
    private Integer countUser;

    public Chat(String name, Integer countUser) {
        this.name = name;
        this.countUser = countUser;
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountUser() {
        return countUser;
    }

    public void setCountUser(Integer countUser) {
        this.countUser = countUser;
    }

    @Override
    public String toString() {
        return "Chat [name=" + name + ", countUser=" + countUser + "]";
    }
}


