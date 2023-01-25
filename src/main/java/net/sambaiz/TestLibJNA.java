package net.sambaiz;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface TestLibJNA extends Library {
    TestLibJNA INSTANCE = Native.load("testjna", TestLibJNA.class);
    String repeat(String str, int n);
}
