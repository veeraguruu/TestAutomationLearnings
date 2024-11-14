package utils;

import org.jasypt.util.text.AES256TextEncryptor;

public class EncryptionUtil {

    private static final String ENC_FLAG_HEADER = "ENC(";
    private static final String ENC_FLAG_FOOTER = "ENC(";

    public static String encrypt(String input){
        String encrypt = "";

        AES256TextEncryptor aes256TextEncryptor = new AES256TextEncryptor();
        aes256TextEncryptor.setPassword("masterPass");
        encrypt = aes256TextEncryptor.encrypt(input);

        String encryptedText = ENC_FLAG_HEADER + encrypt + ENC_FLAG_FOOTER;

        return encryptedText;
    }
}
