import net.sambaiz.TestLibJNA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLibJNATests {
    @Test
    void repeat() {
        assertEquals("abcabcabc", TestLibJNA.INSTANCE.repeat("abc", 3));
    }
}
