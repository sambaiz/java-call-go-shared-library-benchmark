#include "jni.h"

const char* CallJNIGetStringUTFChars(JNIEnv* env, jstring str, jboolean* isCopy);
void CallJNIReleaseStringUTFChars(JNIEnv* env, jstring str, const char* utf);
jstring CallJNINewStringUTF(JNIEnv *env, const char *bytes);