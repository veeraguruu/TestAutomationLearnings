package utils;

import org.example.GetProperties;
import org.jasypt.util.text.AES256TextEncryptor;
import org.slf4j.LoggerFactory;

public class DecryptionUtil {

    private static final String ENC_FLAG_HEADER = "ENC(";

    private static final String ENC_FLAF_FOOTER = ")";

    private static final String masterPass = "";

    public static String decrypt(String input) {

        String decrypt = "";

        try {
            if (input.contains(ENC_FLAG_HEADER)) {
                input = input.replace(ENC_FLAG_HEADER, "").replace(ENC_FLAF_FOOTER, "");
                AES256TextEncryptor aes256TextEncryptor = new AES256TextEncryptor();
                aes256TextEncryptor.setPassword(GetProperties.getProperty("masterpass"));
                decrypt = aes256TextEncryptor.decrypt(input);
            } else {
                return input;
            }
        } catch (Exception e) {

            LoggerFactory.getLogger(DecryptionUtil.class).error("decrypt appname = Learning");

        }
        return decrypt;
    }
}
