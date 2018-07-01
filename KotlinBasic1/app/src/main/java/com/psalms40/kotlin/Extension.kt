package com.psalms40.kotlin

import android.util.Log

/**
 * Created by mac on 2018. 2. 21..
 */
class Extension {

    var strvalue : String = "str1"
    var strValue2 : String = "str2"

    fun String.plus(value: String) : String {
        return this + value
    }

    fun testPlus() {
        Log.d("test Extension", "extension value = ${strvalue.plus(strValue2)}")
    }


}