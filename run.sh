#!/bin/bash -eu

# Settings for Apple silicon
export GOOS=darwin GOARCH=arm64 CGO_ENABLED=1

cd libtest
gcc -shared -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/${GOOS} calljnifunc.c -o libcalljnifunc.so
erb testjni.go.erb > testjni.go
go build -o libtestjni.dylib --buildmode=c-shared testjni.go
go build -o libtestjna.dylib --buildmode=c-shared testjna.go
cp libcalljnifunc.so ..
cd ..

# export LD_LIBRARY_PATH=./libtest # for linux
mvn clean test exec:exec