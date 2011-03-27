package com.jimbarritt.oauth.platform.encryption;

import java.security.*;

public class MessageDigestRepository {

    public MessageDigest loadMessageDigest(String algorithmName) {
        try {
            return MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e) {
            throw new MessageDigestAlgorithmUnavailableException(e);
        }
    }
}