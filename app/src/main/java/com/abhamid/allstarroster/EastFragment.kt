package com.abhamid.allstarroster

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [EastFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [EastFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class EastFragment : Fragment() {
    private lateinit var rv: RecyclerView
    private var list: ArrayList<Players> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView:View =  inflater.inflate(R.layout.fragment_east, container, false)
        rv  = rootView.findViewById(R.id.frag_east_rv)
        rv.setHasFixedSize(true)
        list.addAll(EastData.listData)
        rv.layoutManager = GridLayoutManager(rootView.context, 2)
        val adapter = PlayerAdapter(list)
        rv.adapter = adapter
        return rootView
    }
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        if (context is OnFragmentInteractionListener) {
//            listener = context
//        } else {
//            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
//        }
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        listener = null
//    }
}
