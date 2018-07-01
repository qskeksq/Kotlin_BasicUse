package com.psalms40.kotlinbasic2.adapterView.recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by mac on 2018. 2. 22..
 */
class RecyclerAdapter constructor(data: MutableList<String>): RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    var data: MutableList<String> = mutableListOf()

    init {
        this.data = data
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.textView?.setText(data[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class Holder constructor(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var textView: TextView? = null

        init {
            textView = itemView?.textItem
        }

    }
}