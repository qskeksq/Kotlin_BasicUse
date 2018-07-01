package com.psalms40.kotlin.data

import android.util.Log

/**
 * Created by mac on 2018. 2. 21..
 */
open class NormalUser constructor(val name: String, val age: Int) {

    init {
        Log.d("KData", "전달받은 인자는 ${name}과 ${age}입니다")
    }

}