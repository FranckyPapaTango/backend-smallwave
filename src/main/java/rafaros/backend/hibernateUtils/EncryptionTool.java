package rafaros.backend.hibernateUtils;


import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author BigWave
 */
public class EncryptionTool {

    static BasicTextEncryptor textEncryptor;
    static String snail ="sale porc va !";
    
    public static String encryptPassword(String password) {
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(snail);
        String encryptedPwd = textEncryptor.encrypt(password);
        return encryptedPwd;
    }

    public static String decryptPassword(String password) {
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(snail);
        String decryptedPwd = textEncryptor.decrypt(password);
        return decryptedPwd;
    }

}