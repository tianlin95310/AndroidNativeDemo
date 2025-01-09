#include <com_tl_androidnativedemo_navigation51_MyJniClass.h>
#include <android/log.h>

#define LOG_TAG "infoo"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

JNIEXPORT jint JNICALL Java_com_tl_androidnativedemo_navigation51_MyJniClass_sum
  (JNIEnv * env, jobject o, jint a, jint b){
        LOGI("hello，这里是native层");
        return a + b;
  }