package com.psalms40.kotlinbasic2.adapterView.expandable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by mac on 2018. 2. 22..
 */
class ExpandableAdapter : BaseExpandableListAdapter() {

    var guData: MutableList<ExpandableData> = mutableListOf()

    override fun getGroup(groupPosition: Int): Any {
        return guData[groupPosition]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        var groupView: View
        if(convertView == null) {
            groupView = LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)
        } else {
            groupView = convertView
        }
        groupView.textItem.setText(guData[groupPosition].gu)
        return groupView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return guData[groupPosition].dongList.size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return guData[groupPosition].dongList[childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        var childView: View
        if(convertView == null) {
            childView = LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)
        } else {
            childView = convertView
        }
        childView.textItem.setText(guData[groupPosition].dongList[childPosition])
        return childView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return guData.size
    }

}