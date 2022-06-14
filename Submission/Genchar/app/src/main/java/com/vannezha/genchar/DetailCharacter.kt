package com.vannezha.genchar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCharacter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        val charImage: ImageView = findViewById(R.id.img_chara)
        val charRarity:ImageView = findViewById(R.id.rarity)
        val charVision: ImageView = findViewById(R.id.vision)
        val charDetail: TextView = findViewById(R.id.description)
        val charName: TextView = findViewById(R.id.name)
        val charRegion: TextView = findViewById(R.id.region)
        val charConstellation: TextView = findViewById(R.id.constellation)
        val charBirthday: TextView = findViewById(R.id.birthday)
        val charTitle: TextView = findViewById(R.id.title)

        val bundle: Bundle? = intent.extras

        val image = bundle!!.getInt("EXTRA_IMAGE")
        val rarity = bundle.getInt("EXTRA_RARITY")
        val vision = bundle.getInt("EXTRA_VISION")
        val detail = bundle.getString("EXTRA_DETAIL")
        val name = bundle.getString("EXTRA_NAME")
        val region = bundle.getString("EXTRA_REGION")
        val constellation = bundle.getString("EXTRA_CONSTELLATION")
        val birthday = bundle.getString("EXTRA_BIRTHDAY")
        val title = bundle.getString("EXTRA_TITLE")

        val pageTitle = "$name Information"
        supportActionBar?.title = pageTitle

        charImage.setImageResource(image)
        charRarity.setImageResource(rarity)
        charVision.setImageResource(vision)
        charDetail.text = detail
        charName.text = name
        charRegion.text = region
        charConstellation.text = constellation
        charBirthday.text = birthday
        charTitle.text = title
    }
}