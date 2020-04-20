package com.abhamid.allstarroster

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
//    private lateinit var rv:RecyclerView
//    private var list: ArrayList<Players> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = Color.WHITE
        }

        home_pager.adapter = PagerAdapter(supportFragmentManager)
        home_tabs.setupWithViewPager(home_pager)
//        rv = findViewById(R.id.frag_east_rv)
//        rv.setHasFixedSize(true)
//
//        list.addAll(EastData.listData)
//        rv.layoutManager = GridLayoutManager(this,2)
//        val adapter = PlayerAdapter(list)
//        rv.adapter = adapter
        about_btn.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
