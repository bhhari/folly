#include <vector>
#include <iostream>
#include "com_facebook_presto_folly_FollyData.h"
/*
 * =================IMPLEMENTATION===============
 * Class:     com_facebooj_presto_folly_FollyData
 * Method:    getPage
 */
JNIEXPORT void JNICALL Java_com_facebook_presto_folly_FollyData_getPage
  (JNIEnv *env, jobject obj, jobject buffer) {
    std::cout << "Native Increment Byte Array" << std::endl;
    jbyte *buff = (jbyte *) env->GetDirectBufferAddress(buffer);
    for(int i=0;i<10;i++){
      buff[i] += 1;
    }
}

