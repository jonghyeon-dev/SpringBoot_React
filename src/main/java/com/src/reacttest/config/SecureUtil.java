package com.src.reacttest.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SecureUtil {
    private Logger logger = LoggerFactory.getLogger(SecureUtil.class);

    public String encryptSHA256(String text) throws NoSuchAlgorithmException {
        logger.info("SecureSHA256 encryptSHA256");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        logger.info("SecureSHA256 bytesToHex");
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
}
