package com.psalms40.kotlinbasic2.adapterView.grid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.activity_grid_view.*
import java.text.DateFormatSymbols

class GridViewActivity : AppCompatActivity() {

    var adapter: GridViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        var months = DateFormatSymbols.getInstance().months
        var data: MutableList<String> = mutableListOf()
        for (month in months) {
            data.add(month)
        }
        adapter = GridViewAdapter(this)
        adapter?.data = data
        gridView.adapter = adapter

    }
}
