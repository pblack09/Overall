package com.example.overalltest.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.overalltest.R
import com.example.overalltest.adapters.AdapterMain
import com.example.overalltest.fragments.Fragment_Home
import com.example.overalltest.fragments.Fragment_Profile
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity(), Fragment_Profile.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
    }

    private fun init(){
        val name = intent.getStringExtra("name")
        home_username.text = name

        var myAdapter = AdapterMain(supportFragmentManager)
        home_view_pager.adapter = myAdapter
        home_tab_layout.setupWithViewPager(home_view_pager)

        home_tab_layout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_home_24)
        home_tab_layout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_person_24)
        home_tab_layout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_settings_24)
    }

    override fun onButtonClicked(status: String) {
        var fragmentHome = Fragment_Home.newInstance(status)
        home_tab_layout.getTabAt(0)?.select()
    }


}