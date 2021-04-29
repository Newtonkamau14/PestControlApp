package com.example.pestcontrolapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_advert.*

class Advert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advert)

        btnContact.setOnClickListener {
         val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("0712345678")))
            startActivity(intentDial)
        }
    }
}