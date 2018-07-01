package com.psalms40.kotlinbasic2.adapterView.expandable

/**
 * Created by mac on 2018. 2. 22..
 */
class ExpandableData constructor(gu: String, dongList: MutableList<String>){

    var gu: String = ""
    var dongList: MutableList<String> = mutableListOf()

    init {
        this.gu = gu
        this.dongList = dongList
    }

}