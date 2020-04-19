package com.rizal.dicodingsubmission

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailStream: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_content)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Video Stream"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val setDetail: TextView = findViewById(R.id.tv_item_detail)
        val setFounded: TextView = findViewById(R.id.tv_item_founded)
        val setFounder: TextView = findViewById(R.id.tv_item_founder)
        val setHeadquarters: TextView = findViewById(R.id.tv_item_headquarters)
        val setLink: TextView = findViewById(R.id.tv_item_link)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tFounded = intent.getStringExtra(EXTRA_FOUNDED)
        val tFounder = intent.getStringExtra(EXTRA_FOUNDER)
        val tHeadquarters = intent.getStringExtra(EXTRA_HEADQUARTERS)
        val tLink = intent.getStringExtra(EXTRA_LINK)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        setDetail.text = tDetail
        setFounded.text = tFounded
        setFounder.text = tFounder
        setHeadquarters.text = tHeadquarters
        setLink.text = tLink
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_FOUNDED = "extra_founded"
        const val EXTRA_FOUNDER = "extra_founder"
        const val EXTRA_HEADQUARTERS = "extra_headquarters"
        const val EXTRA_LINK = "extra_link"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}