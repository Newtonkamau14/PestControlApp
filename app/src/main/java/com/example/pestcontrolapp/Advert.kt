package com.example.pestcontrolapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_advert.*

class Advert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advert)

        var productsLists = mutableListOf(
                OtherProducts("Pest Eradication"),
                OtherProducts("Fumigation"),
                OtherProducts("Removal of Pest"),
                OtherProducts("Elimination of Pests"),
                OtherProducts("Prevent future infestation off pests")

        )
        val adapter = OtherProductsAdapter(productsLists)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        btnContact.setOnClickListener {
         val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("0712345678")))
            startActivity(intentDial)
        }
        imageEmail.setOnClickListener {
            val intentEmail = Intent(Intent.ACTION_SENDTO,Uri.parse("mailto:" + Uri.encode("pestcontrol@customer.com")))
            startActivity(intentEmail)
        }
    }
}