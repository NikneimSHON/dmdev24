package javacore.lesson3.tack1.comparator;

import javacore.lesson3.tack1.Chat;

import java.util.Comparator;

public class ComparatorCountUser implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        int ageComparator = Integer.compare(o2.getCountUser(), o1.getCountUser());
        if (ageComparator != 0) {
            return ageComparator;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
