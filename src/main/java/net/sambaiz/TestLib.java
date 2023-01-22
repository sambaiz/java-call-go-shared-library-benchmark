package net.sambaiz;

import java.io.File;
import java.io.IOException;

public class TestLib {
    static {
        System.loadLibrary("test");
    }
    public native String repeat(String s, int n);
}
