package main

/*
#include <stdlib.h>
#include <string.h>
*/
import "C"
import (
	"strings"
	"unsafe"
)

//export repeat
func repeat(buf *C.char, n C.int) {

	cRetStr := C.CString(strings.Repeat(C.GoString(buf), int(n)))
	defer C.free(unsafe.Pointer(cRetStr))

	C.strcpy(buf, cRetStr)
}

func main() {}
