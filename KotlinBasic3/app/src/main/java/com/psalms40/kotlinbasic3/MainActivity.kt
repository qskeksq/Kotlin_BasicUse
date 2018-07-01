package com.psalms40.kotlinbasic3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setLayoutParam(view : View) {
        if(view is LinearLayout) {

        } else if (view is RelativeLayout) {

        }

        when {
            view is LinearLayout -> {  }
            view is RelativeLayout -> {  }
        }
    }

    fun setLayoutParam2(view: View) {
        view.layoutParams = (view.layoutParams as LinearLayout.LayoutParams).apply {
            gravity = Gravity.CENTER_VERTICAL
            leftMargin = 10
            topMargin = 10
        }
    }

    fun sum() : Int {
        var sum: Int = 0
        for(i in 1..50) {
            sum += i
        }
        when {

        }
    }


}
