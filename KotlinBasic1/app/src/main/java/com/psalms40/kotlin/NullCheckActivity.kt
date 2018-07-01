package com.psalms40.kotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_null_check.*

class NullCheckActivity : AppCompatActivity() {

    var strValue: String = ""
    var strValue2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_check)
        setSupportActionBar(toolbar)

        var nullable: String?
        nullable = null

        var notNullable: String
        // notNullable = null
    }

    open fun nullParam(str: String?) {
        // 직접 접근 안 됨
        // var length = str.length
        var length : Int
        // null 체크 해줘야 함
        if (str != null) length = str.length
    }

    open fun nullReturn(value: String): String? {
        return null
    }

    open fun testElvis(str: String?) {
        var resultNull: Int? = str?.length
        var resultNotNull: Int = str?.length?:0
    }

}
