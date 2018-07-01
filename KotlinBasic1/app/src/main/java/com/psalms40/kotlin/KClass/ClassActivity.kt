package com.psalms40.kotlin.KClass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psalms40.kotlin.R

class ClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)
    }

    fun callClass() {
        var klass = KotlinClass1("가나다")
        var Klass2 = KotlinClass2("라마")
    }

}
