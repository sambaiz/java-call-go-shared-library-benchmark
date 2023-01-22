import static org.junit.jupiter.api.Assertions.assertEquals;

import net.sambaiz.TestLib;
import org.junit.jupiter.api.Test;

public class TestLibTests {

    private TestLib testLib = new TestLib();

    @Test
    void repeat() {
        assertEquals("abcabcabc", testLib.repeat("abc", 3));
    }
}
