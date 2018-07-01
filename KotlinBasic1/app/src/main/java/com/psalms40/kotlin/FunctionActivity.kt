package com.psalms40.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.psalms40.kotlin.KClass.KotlinClass1
import com.psalms40.kotlin.KClass.KotlinClass2

open class FunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)
    }

    fun double(x: Int): Int {
        return x * 2
    }

    fun printSum(x: Int, y: Int) {
        Log.d("printSum", "x+y=${x + y}")
    }

    fun getPie(): Double {
        return Math.PI
    }

    fun paramTest(name1: String, number1: Int = 153, number2: Double = 3.14): String {
        return name1
    }

    fun callParamTest(): String {
        return paramTest("가나다")
    }

    fun callParamTest2(): String {
        return paramTest(name1 = "가나다")
    }

}
