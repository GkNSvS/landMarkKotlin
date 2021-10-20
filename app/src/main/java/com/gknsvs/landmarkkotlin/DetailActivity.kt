package com.gknsvs.landmarkkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gknsvs.landmarkkotlin.databinding.ActivityDetailBinding
import com.gknsvs.landmarkkotlin.databinding.RecyclerRowBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val intent=intent
        val selectedLandmark =intent.getSerializableExtra("landmark") as Landmark
        binding.txtName.text=selectedLandmark.name
        binding.txtCountry.text=selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}