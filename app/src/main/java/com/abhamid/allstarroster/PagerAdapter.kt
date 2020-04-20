package com.abhamid.allstarroster

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.text.FieldPosition

class PagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> WestFragment()
            else -> EastFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "Team LeBron"
            else -> "Team Giannis"
        }
    }

}