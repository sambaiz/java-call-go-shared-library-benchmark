#!/bin/bash -eu

echo 'build shared libraries'
cd libtest
gcc -shared -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux calljnifunc.c -o libcalljnifunc.so
go build -o libtest.so --buildmode=c-shared test.go
cd ..

echo 'run tests'
mvn clean
export LD_LIBRARY_PATH=${LD_LIBRARY_PATH}:/app/libtest
mvn test