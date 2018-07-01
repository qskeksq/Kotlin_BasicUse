package com.psalms40.kotlinbasic2.adapterView.list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.activity_list_view.*
import java.text.DateFormatSymbols

class ListViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val months = DateFormatSymbols.getInstance().months
        var data: MutableList<String> = mutableListOf()
        for(item in months) {
            data.add(item)
        }
        var adapter = ListViewAdapter(this)
        adapter.data = data
        listView.adapter = adapter
    }
}
