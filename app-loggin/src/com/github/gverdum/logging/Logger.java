package com.github.gverdum.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    public static void info(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("[INFO] " + sdf.format(new Date()) + " - " + message);
    }
}
