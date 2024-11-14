package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class GetProperties {

     public static String propertyValue = "";
    public static String getProperty(String propertyName){
        try {
            Properties properties = new Properties();

            properties.load(Files.newInputStream((Paths.get("./testing.properties"))));

            propertyValue = properties.getProperty("test." + propertyName.toLowerCase());

            return propertyValue;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
