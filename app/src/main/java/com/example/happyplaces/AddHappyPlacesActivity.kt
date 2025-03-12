package com.example.happyplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.happyplaces.databinding.ActivityAddHappyPlacesBinding

class AddHappyPlacesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddHappyPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAddPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarAddPlace.setNavigationOnClickListener {
            onBackPressed()
        }


    }
}