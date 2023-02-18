#include "calljnifunc.h"

const char* CallJNIGetStringUTFChars(JNIEnv *env, jstring str, jboolean *isCopy) {
  if (str == NULL) {
    return NULL;
  }
  return (*env)->GetStringUTFChars(env, str, isCopy);
}

void CallJNIReleaseStringUTFChars(JNIEnv *env, jstring str, const char *utf) {
  if (str == NULL) {
    return;
  }
  (*env)->ReleaseStringUTFChars(env, str, utf);
}

jstring CallJNINewStringUTF(JNIEnv *env, const char *bytes) {
  return (*env)->NewStringUTF(env, bytes);
}
