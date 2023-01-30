## java-call-go-shared-library-benchmark

```sh
# Run on MacBook Air (M2, 2022) (CPU Cores: 8, Memory: 16 GB)
$ go version
go version go1.19.5 darwin/arm64

$ java -version
openjdk version "1.8.0_342"
OpenJDK Runtime Environment Corretto-8.342.07.3 (build 1.8.0_342-b07)
OpenJDK 64-Bit Server VM Corretto-8.342.07.3 (build 25.342-b07, mixed mode)

$ sh run.sh
...
Benchmark                                 Mode  Cnt     Score    Error  Units
Benchmarks.repeatWithJNADirectMapping     avgt   25  1690.029 ± 19.361  ns/op
Benchmarks.repeatWithJNAInterfaceMapping  avgt   25  3178.877 ± 29.591  ns/op
Benchmarks.repeatWithJNI                  avgt   25  1718.787 ±  9.206  ns/op 
```

### Article

- ja: [Java から Go でビルドした shared library を JNI と JNA で呼び出した際の速度を比較する - sambaiz-net](https://www.sambaiz.net/article/437/)
- en: [Benchmark calling a shared library built in Go from Java with JNI and JNA - sambaiz-net](https://www.sambaiz.net/en/article/437/) 