#include "calljnifunc.h"

const char* CallJNIGetStringUTFChars(JNIEnv *env, jstring str, jboolean *isCopy) {
  return (*env)->GetStringUTFChars(env, str, isCopy);
}

void CallJNIReleaseStringUTFChars(JNIEnv *env, jstring str, const char *utf) {
  (*env)->ReleaseStringUTFChars(env, str, utf);
}

jstring CallJNINewStringUTF(JNIEnv *env, const char *bytes) {
  return (*env)->NewStringUTF(env, bytes);
}