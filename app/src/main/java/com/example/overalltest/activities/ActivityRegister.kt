package com.example.overalltest.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.overalltest.R
import kotlinx.android.synthetic.main.activity_register.*

class ActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()
    }

    private fun init(){
        register_go_to_login.setOnClickListener {
            startActivity(Intent(this, ActivityLogin::class.java))
        }

        register_submit.setOnClickListener {
            val name = register_username.text.toString()
            val email = register_email.text.toString()
            val pass1 = register_password.text.toString()
            val pass2 = register_confirm_password.text.toString()
            val builder = AlertDialog.Builder(this)

            if(pass1 != pass2){
                builder.setTitle("Passwords do not match.")
                builder.setMessage("Please retype both password fields to make sure they match.")
                register_password.text.clear()
                register_confirm_password.text.clear()
                builder.show()
            } else {
                startActivity(Intent(this, ActivityLogin::class.java))
            }
        }
    }
}