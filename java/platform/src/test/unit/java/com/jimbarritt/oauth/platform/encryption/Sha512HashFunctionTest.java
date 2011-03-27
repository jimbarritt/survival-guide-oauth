package com.jimbarritt.oauth.platform.encryption;

import org.junit.*;

import static com.jimbarritt.oauth.platform.io.CharacterEncoding.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class Sha512HashFunctionTest {

    private Sha512HashFunction sha512HashFunction;

    @Before
    public void setUp() {
        sha512HashFunction = new Sha512HashFunction(new MessageDigestRepository(), systemCharacterEncoding());
    }

    @Test
    public void can_hash_a_string_in_sha_512() throws Exception {
        String encryptedA = sha512HashFunction.makeHashFrom("This is my secret message");
        String encryptedB = sha512HashFunction.makeHashFrom("This is my secret message");

        assertThat(encryptedA, is(encryptedB));
    }
}