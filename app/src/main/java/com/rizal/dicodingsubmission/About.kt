package com.rizal.dicodingsubmission

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class About: AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnSendEmail: Button = findViewById(R.id.send_email_btn)
        btnSendEmail.setOnClickListener(this)

        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgMe: ImageView = findViewById(R.id.img_item_photo)
        val tImg = "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/201910252205389d9c5d9b4110fa8d74b45bf38b02b3a9.JPG"

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgMe)
    }

    override fun onClick(v: View){
        when (v.id){
        R.id.send_email_btn ->{
            val email = "risulrisul@gmail.com"
            val btnEmailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
            startActivity(btnEmailIntent)
        }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}