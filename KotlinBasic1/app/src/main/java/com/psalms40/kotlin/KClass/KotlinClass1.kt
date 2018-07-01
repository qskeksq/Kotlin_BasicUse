package com.psalms40.kotlin.KClass

import android.util.Log

/**
 * Created by mac on 2018. 2. 21..
 */
class KotlinClass1 constructor(value: String) {

    init {
        Log.d("KotlinClass1", "생성자로부터 전달받은 값은 ${value} 입니다")
    }

}