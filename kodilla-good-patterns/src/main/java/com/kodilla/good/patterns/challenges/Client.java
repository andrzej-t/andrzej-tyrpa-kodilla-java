package com.kodilla.good.patterns.challenges;

public class Client {
    String name;
    String surname;
    int clientID;

    public int getClientID() {
        return clientID;
    }

    public Client(String name, String surname, int clientID) {
        this.name = name;
        this.surname = surname;
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
