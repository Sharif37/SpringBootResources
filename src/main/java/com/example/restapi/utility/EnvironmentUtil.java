package com.example.restapi.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class EnvironmentUtil {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream(Paths.get("/home/sharif/Documents/extension/spring_boot_project/RestApi/config", ".env").toFile())) {
            properties.load(fis);
            // Set each property as a system property
            properties.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));
        } catch (IOException e) {
            System.err.println("Failed to load environment file: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
