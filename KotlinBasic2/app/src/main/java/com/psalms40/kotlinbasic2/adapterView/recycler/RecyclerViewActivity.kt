package com.psalms40.kotlinbasic2.adapterView.recycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.activity_recycler_view.*
import java.text.DateFormatSymbols

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val months = DateFormatSymbols.getInstance().months
        var data: MutableList<String> = mutableListOf()
        for(item in months) {
            data.add(item)
        }
        var adapter = RecyclerAdapter(data)
        var layoutManger = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManger
    }
}
