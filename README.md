## call-go-func-from-java

```sh
$ docker build --platform linux/x86_64 -t call-go-func-from-java .
$ docker run -v $(PWD):/app -v ~/.m2:/root --platform linux/x86_64 call-go-func-from-java
```