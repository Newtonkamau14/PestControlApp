package com.example.pestcontrolapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.form -> {
                    val intentForm = Intent(this@MainActivity,Form::class.java)
                    startActivity(intentForm)
                }
                R.id.advert -> {
                    val intentAd = Intent(this@MainActivity,Advert::class.java)
                    startActivity(intentAd)
                }
            }
            true
        }
    }
}