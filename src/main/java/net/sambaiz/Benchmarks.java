package net.sambaiz;

import com.sun.jna.Native;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Benchmarks {
    @State(Scope.Thread)
    public static class Instances {
        public TestLibJNI testLibJNI = new TestLibJNI();
        public TestLibJNAInterfaceMapping testLibJNAInterfaceMapping = TestLibJNAInterfaceMapping.INSTANCE;
        public TestLibJNADirectMapping testLibJNADirectMapping = new TestLibJNADirectMapping();
    }

    @Benchmark
    public String repeatWithJNI(Instances in) {
        return in.testLibJNI.repeat("abc", 3);
    }

    @Benchmark
    public String repeatWithJNAInterfaceMapping(Instances in) {
        byte[] buf = new byte[256];
        byte[] data = "abc".getBytes();
        System.arraycopy(data, 0, buf, 0, data.length);

        in.testLibJNAInterfaceMapping.repeat(buf, 3);
        return Native.toString(buf);
    }

    @Benchmark
    public String repeatWithJNADirectMapping(Instances in) {
        byte[] buf = new byte[256];
        byte[] data = "abc".getBytes();
        System.arraycopy(data, 0, buf, 0, data.length);

        in.testLibJNADirectMapping.repeat(buf, 3);
        return Native.toString(buf);
    }
}