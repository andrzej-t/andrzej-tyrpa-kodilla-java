package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public Forum() {
        userList.add(new ForumUser(1123,"John Walker", 'M', LocalDate.of(2002,12,12),12));
        userList.add(new ForumUser(2231,"Jim Beam", 'M', LocalDate.of(1982,10,11),0));
        userList.add(new ForumUser(3124,"Merry Bloody", 'F', LocalDate.of(1962,5,8),14));
        userList.add(new ForumUser(4786,"Peter Smirnoff", 'M', LocalDate.of(1931,8,2),5));
        userList.add(new ForumUser(9765,"Captain Morgan", 'M', LocalDate.of(1941,3,6),4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }


}
