package main

/*
#cgo CFLAGS: -I/usr/local/openjdk-8/include/
#cgo CFLAGS: -I/usr/local/openjdk-8/include/linux
#cgo LDFLAGS: -L${SRCDIR} -lcalljnifunc
#include "calljnifunc.h"
*/
import "C"
import (
	"strings"
)

//export Java_net_sambaiz_TestLib_repeat
func Java_net_sambaiz_TestLib_repeat(env *C.JNIEnv, clazz C.jclass, str C.jstring, n C.jint) C.jstring {
	cstr := C.CallJNIGetStringUTFChars(env, str, (*C.jboolean)(nil))
	defer C.CallJNIReleaseStringUTFChars(env, str, cstr)
	ret := Repeat(C.GoString(cstr), int(n))
	return C.CallJNINewStringUTF(env, C.CString(ret))
}

//export Repeat
func Repeat(str string, n int) string {
	return strings.Repeat(str, n)
}

func main() {}
