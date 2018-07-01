package com.psalms40.kotlinbasic2.adapterView.list

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
class ListViewAdapter constructor(context: Context) : BaseAdapter() {

    var context: Context? = null
    var data: MutableList<String> = mutableListOf()

    init {
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
        var holder: Holder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item,null);
            holder = Holder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as Holder
        }
        holder.textView?.setText(data.get(position))
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

    class Holder constructor(view: View?) {
        var textView: TextView? = null
        init {
            textView = view?.textItem
        }
    }

}