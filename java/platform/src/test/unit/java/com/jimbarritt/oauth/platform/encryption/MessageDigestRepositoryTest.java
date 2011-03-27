package com.jimbarritt.oauth.platform.encryption;

import org.junit.*;

import java.security.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MessageDigestRepositoryTest {

    private MessageDigestRepository messageDigestRepository;

    @Before
    public void setUp() {
        messageDigestRepository = new MessageDigestRepository();
    }

    @Test
    public void loads_a_valid_algorithm() {
        MessageDigest sha1MessageDigest = messageDigestRepository.loadMessageDigest("SHA1");

        assertThat(sha1MessageDigest, is(notNullValue()));
    }

    @Test(expected = MessageDigestAlgorithmUnavailableException.class)
    public void fails_if_the_algorithm_does_not_exist() {
        messageDigestRepository.loadMessageDigest("FOOBAR");
    }

}