package com.example.bahrber.passwordencrypter;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;


public class Encryption {

    public String basicPasswordEncryption(String password) {
        BasicPasswordEncryptor encryptor = new BasicPasswordEncryptor();
        String newPassword = encryptor.encryptPassword(password);
        return newPassword;
    }

    public String strongPasswordEncryption (String password) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        String newPassword = encryptor.encryptPassword(password);
        return newPassword;
    }

    public int hashEncryption (String password) {
        int newPassword = password.hashCode();
        return newPassword;
    }
}
