package org.example;

import org.ini4j.Ini;
import utils.DecryptionUtil;

import java.io.IOException;
import java.io.InputStream;

public class TestEnvironment {

    public static String getUrl(String urlName) {

        return DecryptionUtil.decrypt(readIni().get(GetProperties.getProperty("environment").toUpperCase(), urlName.toLowerCase() + ".url"));
    }

    private static Ini readIni() {
        Ini ini = null;
        try {
            InputStream stream = ClassLoader.getSystemResourceAsStream("environment.ini");
            ini = new Ini(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ini;
    }
}
