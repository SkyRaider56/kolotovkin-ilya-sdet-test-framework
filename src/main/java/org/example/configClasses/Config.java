package org.example.configClasses;

import java.time.Duration;

public class Config {
    public static final Boolean CLEAR_COOKIES = true;
    public static String BROWSER = "chrome"; // Сделать метод самоопределения браузера
    public static class TimeOutVariable {
        public static final int IMPLICIT_WAIT = 5;
    }
    public static Duration EXPLICIT_WAIT = Duration.ofSeconds(30);
}
