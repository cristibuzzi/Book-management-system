package org.example.utils;

import org.example.model.Author;
import org.example.model.Book;
import org.example.model.Reviews;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {

    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("book_management_system");
    }

    public static void shutdown() {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Reviews.class);
    }
}
