package com.jimbarritt.oauth.platform.encryption;

import com.jimbarritt.oauth.platform.io.*;
import org.junit.*;

import java.nio.charset.*;

import static com.jimbarritt.oauth.platform.io.CharacterEncoding.systemCharacterEncoding;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Sha512HashFunctionTest {

    @Test
    public void can_hash_a_string_in_sha_512() throws Exception {
        Sha512HashFunction sha512HashFunction = new Sha512HashFunction(new MessageDigestRepository(), systemCharacterEncoding());

        String encryptedA = sha512HashFunction.makeHashFrom("This is my secret message");
        String encryptedB = sha512HashFunction.makeHashFrom("This is my secret message");

        assertThat(encryptedA, is(encryptedB));
    }

}