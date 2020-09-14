package com.example.overalltest.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.overalltest.fragments.Fragment_Home
import com.example.overalltest.fragments.Fragment_Profile
import com.example.overalltest.fragments.Fragment_Settings

class AdapterMain(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> Fragment_Home()
            1 -> Fragment_Profile()
            else -> Fragment_Settings()
        }
    }

}