package com.example.overalltest.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.overalltest.R
import kotlinx.android.synthetic.main.activity_main.*

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        login_go_to_register.setOnClickListener{
            startActivity(Intent(this, ActivityRegister::class.java))
        }

        login_submit.setOnClickListener {
            val intent = Intent(this, ActivityHome::class.java)
            val name = login_username.text.toString()
            intent.putExtra("name", name)
            startActivity(intent)
        }

    }
}