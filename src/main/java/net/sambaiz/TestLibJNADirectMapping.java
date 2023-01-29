package net.sambaiz;

import com.sun.jna.Native;

public class TestLibJNADirectMapping {
    static {
        Native.register("testjna");
    }

    public static native void repeat(byte[] buf, int n);
}
