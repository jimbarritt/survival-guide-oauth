package com.jimbarritt.oauth.platform.encryption;

import java.nio.charset.*;
import java.security.*;

public class Sha512HashFunction implements HashFunction {

    private final MessageDigest sha1MessageDigest;
    private final Charset encoding;

    public Sha512HashFunction(MessageDigestRepository messageDigestRepository, Charset encoding) {
        this.encoding = encoding;
        sha1MessageDigest = messageDigestRepository.loadMessageDigest("SHA-512");
    }


    public String makeHashFrom(String input) {
        byte[] digest = sha1MessageDigest.digest(input.getBytes(encoding));
        return new String(digest, encoding);
    }
}