package com.jimbarritt.oauth.platform.encryption;

import java.security.*;

public class MessageDigestAlgorithmUnavailableException extends RuntimeException {
    public MessageDigestAlgorithmUnavailableException(NoSuchAlgorithmException e) {
        super("Could not load Message Digest (See cause)",e);
    }
}