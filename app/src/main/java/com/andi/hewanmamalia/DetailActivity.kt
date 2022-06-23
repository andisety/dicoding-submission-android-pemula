package com.andi.hewanmamalia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var tvName:TextView
    private lateinit var tvDetail:TextView
    private lateinit var ivImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val detail = intent.getStringExtra("detail")
        val image = intent.getIntExtra("image",0)
        supportActionBar?.title = name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        inisialisasi()

        tvName.text=name
        tvDetail.text=detail
        ivImage.setImageResource(image)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun inisialisasi() {
        tvName = findViewById(R.id.tv_name_detail)
        tvDetail = findViewById(R.id.tv_detail_detail)
        ivImage = findViewById(R.id.iv_img_detail)

    }
}