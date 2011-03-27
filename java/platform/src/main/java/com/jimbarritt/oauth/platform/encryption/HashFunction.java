package com.jimbarritt.oauth.platform.encryption;

import java.security.*;

public interface HashFunction {

    String makeHashFrom(String input);


}