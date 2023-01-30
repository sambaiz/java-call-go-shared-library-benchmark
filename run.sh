#!/bin/bash -eu

# Settings for macOS
export OS_NAME=darwin DYLIB_EXTENSION=dylib

cd libtest
gcc -shared -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/${OS_NAME} calljnifunc.c -o libcalljnifunc.so
erb testjni.go.erb > testjni.go
go build -o libtestjni.dylib --buildmode=c-shared testjni.go
go build -o libtestjna.dylib --buildmode=c-shared testjna.go
cp libcalljnifunc.so ..
cd ..

# export LD_LIBRARY_PATH=./libtest # for linux
mvn clean test exec:exec