package net.sambaiz;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface TestLibJNAInterfaceMapping extends Library {
    TestLibJNAInterfaceMapping INSTANCE = Native.load("testjna", TestLibJNAInterfaceMapping.class);
    void repeat(byte[] buf, int n);
}
