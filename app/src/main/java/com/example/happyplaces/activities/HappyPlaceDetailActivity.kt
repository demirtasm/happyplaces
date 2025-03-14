package com.example.happyplaces.activities

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.happyplaces.R
import com.example.happyplaces.databinding.ActivityHappyPlaceDetailBinding
import com.example.happyplaces.models.HappyPlaceModel

class HappyPlaceDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHappyPlaceDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHappyPlaceDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)





        var happyPlaceDetailModel : HappyPlaceModel?= null
        if(intent.hasExtra(MainActivity.EXTRA_PLACE_DETAILS)){
            happyPlaceDetailModel = intent.getSerializableExtra(MainActivity.EXTRA_PLACE_DETAILS) as HappyPlaceModel
        }
        if(happyPlaceDetailModel !=null){
            setSupportActionBar(binding.toolbarAddPlace)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = happyPlaceDetailModel.title

            binding.toolbarAddPlace.setNavigationOnClickListener {
                onBackPressed()
            }

            binding.ivPlaceImage.setImageURI(Uri.parse(happyPlaceDetailModel.image))
            binding.tvDescription.text = happyPlaceDetailModel.description
            binding.tvLocation.text = happyPlaceDetailModel.location
        }

    }
}