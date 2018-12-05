package com.example.bahrber.passwordencrypter;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;


public class Encryption {

    public void basicPasswordEncryption(String password) {
        BasicPasswordEncryptor encryptor = new BasicPasswordEncryptor();
        String newPassword = encryptor.encryptPassword(password);
        System.out.println(newPassword);
    }

    public void strongPasswordEncryption (String password) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        String newPassword = encryptor.encryptPassword(password);
        System.out.println(newPassword);
    }

    public void hashEncryption (String password) {
        int newPassword = password.hashCode();
        System.out.println(newPassword);
    }
}
