package com.example.tarikul.loginformkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById<View>(R.id.et_user_name) as EditText
        var et_password = findViewById<View>(R.id.et_password) as EditText
        var btn_reset = findViewById<View>(R.id.btn_reset) as Button
        var btn_submit = findViewById<View>(R.id.btn_submit) as Button

        btn_submit.setOnClickListener{
            val user_name = et_user_name.text;
            //val password = et_password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()
        }

        btn_reset.setOnClickListener{
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }
    }
}
