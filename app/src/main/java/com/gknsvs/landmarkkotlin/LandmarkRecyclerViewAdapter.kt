package com.gknsvs.landmarkkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gknsvs.landmarkkotlin.databinding.ActivityDetailBinding
import com.gknsvs.landmarkkotlin.databinding.RecyclerRowBinding

class LandmarkRecyclerViewAdapter(var landmarkList: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkRecyclerViewAdapter.LandmarkRecyclerViewHolder>() {

    class LandmarkRecyclerViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkRecyclerViewHolder {
        var binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkRecyclerViewHolder, position: Int) {
        holder.binding.textView.text= landmarkList[position].name
        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,DetailActivity::class.java)
            intent.putExtra("landmark",landmarkList[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}