package com.example.overalltest.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.overalltest.R
import com.example.overalltest.activities.ActivityHome
import kotlinx.android.synthetic.main.fragment_profile.view.*

class Fragment_Profile : Fragment() {

    var listener: OnFragmentInteraction? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_profile, container, false)

        init(view)

        return view
    }

    private fun init(view: View){
        view.button_update_status.setOnClickListener {
            var status = view.profile_status.text.toString()
            listener?.onButtonClicked(status)
        }
    }

    interface OnFragmentInteraction {
        fun onButtonClicked(status: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as ActivityHome
    }

}