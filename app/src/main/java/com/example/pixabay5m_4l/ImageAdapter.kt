package com.example.pixabay5m_3l

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.pixabay5m_3l.databinding.ItemImageBinding

class ImageAdapter(val list: java.util.ArrayList<ImageModel>) : Adapter<ImageAdapter.ImageViewHolder>() {

    fun addData(list:List<ImageModel>){
        this.list.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    inner class ImageViewHolder(val binding: ItemImageBinding) : ViewHolder(binding.root) {
        fun onBind(model: ImageModel) {
            binding.imageView.load(model.largeImageURL)
        }

    }
}