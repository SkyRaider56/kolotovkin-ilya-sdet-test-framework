package org.example.configClasses;

public class Config {
    public static final Boolean CLEAR_COOKIES = true;
    public static String BROWSER = "chrome"; // Сделать метод самоопределения браузера
    public static class TimeOutVariable {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 30;
    }
}
