package com.psalms40.kotlinbasic2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import com.psalms40.kotlinbasic2.adapterView.expandable.ExpandableListViewActivity
import com.psalms40.kotlinbasic2.adapterView.grid.GridViewActivity
import com.psalms40.kotlinbasic2.adapterView.list.ListViewActivity
import com.psalms40.kotlinbasic2.adapterView.recycler.RecyclerViewActivity
import com.psalms40.kotlinbasic2.adapterView.spinner.SpinnerActivity
import com.psalms40.kotlinbasic2.custom.CustomViewActivity
import com.psalms40.kotlinbasic2.fragment.Test2Fragment
import com.psalms40.kotlinbasic2.fragment.TestFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var manager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goSpinner.setOnClickListener { startActivity(Intent(this, SpinnerActivity::class.java)) }
        goListView.setOnClickListener { startActivity(Intent(this, ListViewActivity::class.java)) }
        goGridView.setOnClickListener { startActivity(Intent(this, GridViewActivity::class.java)) }
        goRecycler.setOnClickListener { startActivity(Intent(this, RecyclerViewActivity::class.java)) }
        goExpandable.setOnClickListener { startActivity(Intent(this, ExpandableListViewActivity::class.java)) }
        goFragment.setOnClickListener { goFragment() }
        goCustomView.setOnClickListener { startActivity(Intent(this, CustomViewActivity::class.java)) }
    }

    fun goFragment() {
        val fragment = TestFragment.newInstance("1", "2")
        manager = supportFragmentManager
        val transaction = manager!!.beginTransaction()
        transaction.add(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun goNextFragment() {
        var fragment = Test2Fragment.newInstance("1", "2")
        val transaction = manager!!.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}
