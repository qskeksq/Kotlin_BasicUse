package com.psalms40.kotlin.data

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.psalms40.kotlin.R

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
    }

    open fun testUser() {
        var dataUser = DataUser("name", 31)
        var normalUser = NormalUser("name2", 32)

        // toString() 지원
        Log.d("testData", "DataUser는 ${dataUser}")
        Log.d("testData", "NormalUser는 ${normalUser}")

        // copy() 지원
        var copyData = dataUser.copy()
        Log.d("testData", "CopyData는 ${copyData}")

        // 변수 나누기
        var (n, a) = copyData
        Log.d("testData", "n의 값은 $n a의 값은 $a 입니다")

    }

}
