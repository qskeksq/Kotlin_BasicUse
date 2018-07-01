package com.psalms40.kotlin.KClass

import android.util.Log

/**
 * Created by mac on 2018. 2. 21..
 */
class Child : Parent() {

    fun callVariables() {
        // private 변수 privateVal 은 접근할 수 없다
        // protected 변수 protectedVal 은 상속관계이므로 접근할 수 있다
        Log.d("Modifier", "protected 변수의 값은 ${protectedVal}입니다")
        // internal 변수 internalVal 은 동일한 모듈이므로 접근할 수 있다
        Log.d("Modifier", "internal 변수의 값은 ${internalVal}입니다")
        // 접근제한자가 없는 변수 defaultVal에는 public 이 적용되어 접근할 수 있다
        Log.d("Modifier", "기본제한자 변수 defaultVal의 값은 ${defaultVal}입니다")
        // Nested 클래스도 Protected 이므로 접근할 수 있다
        val protectedNested = ProtectedNested()
    }
}