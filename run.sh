#!/bin/bash -eu

echo 'build shared libraries'
cd libtest
gcc -shared -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux calljnifunc.c -o libcalljnifunc.so
go build -o libtestjni.so --buildmode=c-shared testjni.go
go build -o libtestjna.so --buildmode=c-shared testjna.go
cd ..

echo 'run tests'
export LD_LIBRARY_PATH=/app/libtest
mvn test

echo 'run benchmarks'
mvn exec:exec