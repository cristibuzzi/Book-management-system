package org.example;

import org.example.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();


        SessionManager.shutdown();
    }
}