package com.example.kv

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row.view.*

class magazineAdapter (val magazineList:ArrayList<ModelMag>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //holder.bind(magazineList[position])
        var modelMag:ModelMag = magazineList.get(position)

        holder.itemView.findViewById<TextView>(R.id.articleTitle).text = modelMag.title
        var pic:ImageView =holder.itemView.findViewById<ImageView>(R.id.articleImage)
        ///pic.setImageResource(modelMag.image)

        //Picasso.get().load(modelMag.image).resize(50, 50).centerCrop().into(pic)
        Picasso.get().load(modelMag.image).into(pic)
        //Picasso.get().load(modelMag.image).resize(pic.width,pic.height).into(pic)
    }

    override fun getItemCount(): Int {
        return magazineList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row, parent, false)
        val intent = Intent(parent.context,Article::class.java)
        view.setOnClickListener{
            startActivity(parent.context,intent,Bundle())
        }
        return MyViewHolder(view)
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: ModelMag) {
        with(itemView) {
            articleTitle.text = item.title
            articleImage.setImageResource(item.image)
        }
    }
}