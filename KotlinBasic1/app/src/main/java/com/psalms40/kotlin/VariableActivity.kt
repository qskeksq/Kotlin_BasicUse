package com.psalms40.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.psalms40.kotlin.R.id.button
import kotlinx.android.synthetic.main.activity_main.*

class VariableActivity : AppCompatActivity() {

    // var
    var strValue: String = ""
    var strValue2 = ""
    var intvalue: Int = 0
    var intValue2 = 1
    var booleanValue = true
    var booleanValue2: Boolean = true

    // val
    val intValue3 = 3
    val strValue3 = ""

    // array
    var intArray = arrayOf(1, 2, 3, 4, 5)
    var intArray2: IntArray = intArrayOf(1, 2, 3, 4, 5)
    var strArray = arrayOf("a", "b", "c");
    var strArray2: Array<String> = arrayOf("a", "b", "c")
    // object array
    var objectArray = Array(10, {item->""})

    // Mutable Collection
    // java class
    var list1 = arrayListOf("a", "b", "c")
    var list2 = arrayListOf<String>()
    var list4 : ArrayList<String> = arrayListOf("a", "b", "c")
    // kotlin class
    var list5 = mutableListOf("a", "b", "c")
    var list6 = mutableListOf<String>()
    var list7 : MutableList<String> = mutableListOf()
    var list8 : MutableList<String> = mutableListOf("a", "b", "c")

    var map1 = mutableMapOf<String, String>()
    var map2 : MutableMap<String, String> = mutableMapOf()

    var set1 = mutableSetOf<String>()
    var set2 : MutableSet<String> = mutableSetOf()

    // Immutable Collection
    var imList1 = listOf("a", "b", "c")
    var imList2 = listOf<String>()
    var imList3 : List<String> = listOf("a", "b", "c")
    var imList4 : List<String> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { button.setText("Hello Kotlin!") }

        // when
        var now = 10
        when (now) {
            8 -> Log.d("when", "현재 시간은 8시 입니다")
            9 -> {
                Log.d("when", "현재 시간은 9시 입니다")
            }
            else -> {
                Log.d("when", "9시가 지났습니다")
            }
        }

        when (now) {
            8, 9 -> Log.d("when", "현재 시간은 ${now}시 입니다")
            else -> {
                Log.d("when", "9시가 지났습니다")
            }
        }

        when (now) {
            in 1..10 -> Log.d("when", "1 에서 10 사이에 값이 존재합니다")
            !in 1..10 -> Log.d("when", "1 에서 10 사이에 값이 없습니다")
            else -> Log.d("when", "10보다 큽니다")
        }

        // array
        for (i in 1..10) {
            Log.d("for", "현재 숫자는 ${i}")
        }

        for (i in strArray.iterator()) {
            Log.d("for2", "현재 숫자는 ${i}")
        }

        for (i in strArray.indices) {
            Log.d("for3", "현재 인덱스는 ${i}")
            Log.d("for3", "현재 값은 ${strArray[i]}")
        }

        intArray.set(0, 100)
        intArray[0] = 100

        // while, do-while
        var game = 1
        var match = 6
        do {
            Log.d("while", "${game}게임 이겼습니다 우승까지 ${match-game}게임 남았습니다")
            game++
        } while( game < match )

        // Collection List
        list5.removeAt(0);
        list5.remove("a")

        // Collection Map
        map2.put("k1", "v1")
        map2.put("k2", "v2")




    }
}
