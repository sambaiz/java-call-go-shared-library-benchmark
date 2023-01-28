import net.sambaiz.TestLibJNI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLibJNITests {
    @Test
    void repeat() {
        assertEquals("abcabcabc", new TestLibJNI().repeat("abc", 3));
    }
}
