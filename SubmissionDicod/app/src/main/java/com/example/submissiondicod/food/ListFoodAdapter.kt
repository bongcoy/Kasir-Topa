package com.example.submissiondicod.food

import android.media.browse.MediaBrowser
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submissiondicod.R

class ListFoodAdapter (private val listfood : ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback : OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(item : Food)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_main_item_name)
        var tvCategory : TextView = itemView.findViewById(R.id.tv_main_item_category)
        var tvPrice : TextView = itemView.findViewById(R.id.tv_main_item_price)
        var ivPhoto : ImageView = itemView.findViewById(R.id.iv_main_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_menu,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listfood[position]

        Glide.with(holder.itemView.context)
                .load(food.photo)
                .apply(RequestOptions.overrideOf(60,60))
                .into(holder.ivPhoto)

        holder.tvName.text = food.name
        holder.tvCategory.text = food.category
        holder.tvPrice.text = food.price

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listfood[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listfood.size
    }

}