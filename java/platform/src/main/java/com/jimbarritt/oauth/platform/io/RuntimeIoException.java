package com.jimbarritt.oauth.platform.io;

import java.io.*;

public class RuntimeIoException extends RuntimeException {

    public RuntimeIoException(IOException cause) {
        super("An IOException occurred (See Cause)", cause);
    }
}