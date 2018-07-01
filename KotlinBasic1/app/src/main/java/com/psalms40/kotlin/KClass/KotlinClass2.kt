package com.psalms40.kotlin.KClass

import android.util.Log

/**
 * Created by mac on 2018. 2. 21..
 */
open class KotlinClass2 {

    open val class2Val : Int = 0

    constructor(value: String) {
        Log.d("KotlinClass2", "생성자로부터 전달받은 값은 ${value} 입니다")
    }

    open fun class2Fun() {

    }

}