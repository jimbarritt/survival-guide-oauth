package com.jimbarritt.oauth.platform.io;

import java.nio.charset.*;

public class CharacterEncoding {

    public static Charset systemCharacterEncoding() {
        return Charset.forName("UTF-8");
    }
}