package com.example.lelangku_coba_api.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lelangku_coba_api.R
import com.example.lelangku_coba_api.data.remote.response.MyProductsItem
import com.example.lelangku_coba_api.data.remote.response.MyProductsItemItem

class HomeAdapter(private val list: List<MyProductsItemItem>): RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.product_title)
        val id: TextView = view.findViewById(R.id.product_id)
        val image: ImageView = view.findViewById(R.id.product_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.id.text = list[position].title
        Glide.with(holder.itemView.context)
            .load(list[position].url)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface onItemClick{
        fun setOnItemClick(data: MyProductsItemItem, position: Int)
    }
}