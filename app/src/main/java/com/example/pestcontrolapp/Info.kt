package com.example.pestcontrolapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_info.btnInfoBack

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val user = intent.getSerializableExtra("EXTRA_USER") as UsersData
        tvUser.text = user.toString()

        btnInfoBack.setOnClickListener {
            finish()
        }
    }
}