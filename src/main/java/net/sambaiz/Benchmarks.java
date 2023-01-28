package net.sambaiz;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.CommandLineOptionException;
import org.openjdk.jmh.runner.options.CommandLineOptions;

public class Benchmarks {
    @State(Scope.Thread)
    public static class Instances {
        public TestLibJNI testLibJNI = new TestLibJNI();
        public TestLibJNA testLibJNA = TestLibJNA.INSTANCE;

    }

    @Benchmark
    public void repeatWithJNI(Instances in) {
        in.testLibJNI.repeat("abc", 3);
    }

    @Benchmark
    public void repeatWithJNA(Instances in) {
        in.testLibJNA.repeat("abc", 3);
    }

    public static void main(String[] argv) throws CommandLineOptionException, RunnerException {
        CommandLineOptions cmdOptions = new CommandLineOptions(argv);
        new Runner(cmdOptions).run();
    }
}