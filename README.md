## java-call-go-shared-library-benchmark

```sh
# Run on MacBook Air (M2, 2022) (CPU Cores: 8, Memory: 16 GB)
$ sh run.sh

Benchmark                                 Mode  Cnt     Score    Error  Units
Benchmarks.repeatWithJNADirectMapping     avgt   25  1690.029 ± 19.361  ns/op
Benchmarks.repeatWithJNAInterfaceMapping  avgt   25  3178.877 ± 29.591  ns/op
Benchmarks.repeatWithJNI                  avgt   25  1718.787 ±  9.206  ns/op 
```