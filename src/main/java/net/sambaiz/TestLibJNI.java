package net.sambaiz;

import com.sun.jna.Native;

import java.io.File;
import java.io.IOException;

public class TestLibJNI {
    static {
        System.loadLibrary("testjni");
    }

    public native String repeat(String str, int n);
}
