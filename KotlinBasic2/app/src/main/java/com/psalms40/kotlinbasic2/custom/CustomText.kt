package com.psalms40.kotlinbasic2.custom

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.psalms40.kotlinbasic2.R

/**
 * Created by mac on 2018. 2. 22..
 */
class CustomText : AppCompatTextView {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    fun init(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomText)
        val size = typedArray.length()

        for (i in 0 until size) {
            when (typedArray.getIndex(i)) {
                R.styleable.CustomText_delimeter -> {
                    val delimeter = typedArray.getString(typedArray.getIndex(i))
                    runTask(delimeter)
                }
            }
        }
    }

    fun runTask(delimeter:String){
        var one = text.substring(0,4)
        var two = text.substring(4,6)
        var three = text.substring(6)

        setText(one + delimeter + two + delimeter + three)
    }

}