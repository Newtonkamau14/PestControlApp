package com.example.pestcontrolapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        btnSubmit.setOnClickListener {
            val name=editTextName.text.toString()
            val emailAdd=editTextEmail.text.toString()
            val gender=editTextGender.text.toString()
            val houseNo=editTextHouseNumber.text.toString().toInt()
            val phoneNo=editTextPhone.text.toString().toInt()
            val pestsCon=editTextPests.text.toString()
            val user=UsersData(name, emailAdd, gender, houseNo, phoneNo, pestsCon)
            Intent(this,Info::class.java).also {
                it.putExtra("EXTRA_USER",user)
                startActivity(it)
            }
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}