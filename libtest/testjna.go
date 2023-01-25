package main

import "C"
import "strings"

//export repeat
func repeat(str *C.char, n C.int) *C.char {
	return C.CString(strings.Repeat(C.GoString(str), int(n)))
}

func main() {}
