package com.example.bahrber.passwordencrypter;

import org.jasypt.util.numeric.BasicIntegerNumberEncryptor;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;

import java.math.BigInteger;


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
    
    public BigInteger basicIntegerPasswordEncryption (String password) {
        BasicIntegerNumberEncryptor encryptor = new BasicIntegerNumberEncryptor();
        int passwordAsInt = Integer.parseInt(password);
        BigInteger passwordAsBigInt = BigInteger.valueOf(passwordAsInt);
        BigInteger newPassword = encryptor.encrypt(passwordAsBigInt);
        return newPassword;
    }

    public String basicTextPasswordEncryption (String password) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        String newPassword = encryptor.encrypt(password);
        return newPassword;
    }
}
