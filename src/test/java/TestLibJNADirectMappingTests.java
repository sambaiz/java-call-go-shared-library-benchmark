import com.sun.jna.Native;
import net.sambaiz.TestLibJNADirectMapping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLibJNADirectMappingTests {
    @Test
    void repeat() {
        byte[] buf = new byte[256];
        byte[] data = "abc".getBytes();
        System.arraycopy(data, 0, buf, 0, data.length);

        new TestLibJNADirectMapping().repeat(buf, 3);
        assertEquals("abcabcabc", Native.toString(buf));
    }
}
