package com.psalms40.kotlinbasic2.adapterView.grid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by mac on 2018. 2. 21..
 */
class GridViewAdapter constructor(context: Context) : BaseAdapter() {

    var context: Context? = null
    var data: MutableList<String> = mutableListOf()

    init {
        this.context = context
    }

    open fun setAdapterData(data: MutableList<String>) {
        this.data = data
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
        var holder: Holder
        if (convertView == null) {
            view = LayoutInflater.from(parent?.context).inflate(R.layout.item, null)
            holder = Holder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as Holder
        }
        holder.textView?.setText(data[position])
        return view
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }

    inner class Holder constructor(itemView: View) {

        var textView: TextView? = null

        init {
            textView = itemView?.textItem
        }

    }

}