package com.psalms40.kotlinbasic2.adapterView.expandable

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.psalms40.kotlinbasic2.R
import kotlinx.android.synthetic.main.activity_expandable_list_view.*

class ExpandableListViewActivity : AppCompatActivity() {
    
    var adapter: ExpandableAdapter? = null
    var data: MutableList<ExpandableData> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_list_view)
        loadData()
        adapter = ExpandableAdapter()
        adapter?.guData = data
        expandable.setAdapter(adapter)
    }

    fun loadData(){
        // 그룹 데이터명 설정
        var gu = "강남구"
        // 하위 데이터 목록 작성
        var child = mutableListOf("개포동","논현동","대치동","도곡동","압구정동")
        // 그룹 데이터명과 하위 데이터명으로 ExpandableData를 생성한 후 저장
        data.add(ExpandableData(gu,child))
        // 아래는 "구" 단위로 반복
        gu = "강동구"
        child = mutableListOf("고덕동","길동","둔촌동","명일동","상일동")
        data.add(ExpandableData(gu,child))

        gu = "강북구"
        child = mutableListOf("미아동","번동","삼각산동","삼양동","송중동")
        data.add(ExpandableData(gu,child))

        gu = "강서구"
        child = mutableListOf("가양동","공항동","등촌동","발산동","방화동")
        data.add(ExpandableData(gu,child))

        gu = "관악구"
        child = mutableListOf("낙성대동","난곡동","난향동","남현동","대학동")
        data.add(ExpandableData(gu,child))
    }

}
