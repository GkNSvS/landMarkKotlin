package com.gknsvs.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gknsvs.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        landmarkList=ArrayList<Landmark>()
        landmarkList.add(Landmark("eiffel","France",R.drawable.eiffel))
        landmarkList.add(Landmark("sieges","Germany",R.drawable.sieges))
        landmarkList.add(Landmark("Anitkabir","Turkey",R.drawable.anitkabir))

        binding.recyclerView.adapter=LandmarkRecyclerViewAdapter(landmarkList)
        binding.recyclerView.layoutManager= LinearLayoutManager(this)


    }
}