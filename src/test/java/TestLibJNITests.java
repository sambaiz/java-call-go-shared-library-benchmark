import static org.junit.jupiter.api.Assertions.assertEquals;

import net.sambaiz.TestLibJNI;
import org.junit.jupiter.api.Test;

public class TestLibJNITests {
    @Test
    void repeat() {
        assertEquals("abcabcabc", new TestLibJNI().repeat("abc", 3));
    }
}
