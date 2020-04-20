package com.abhamid.allstarroster


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WestFragment : Fragment() {
    private lateinit var rv: RecyclerView
    private var list: ArrayList<Players> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView:View =  inflater.inflate(R.layout.fragment_east, container, false)
        rv  = rootView.findViewById(R.id.frag_east_rv)
        rv.setHasFixedSize(true)
        list.addAll(WestData.listData)
        rv.layoutManager = GridLayoutManager(rootView.context, 2)
        val adapter = PlayerAdapter(list)
        rv.adapter = adapter
        return rootView
    }


}
