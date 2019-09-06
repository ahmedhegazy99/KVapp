package com.example.kv

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row.view.*

abstract class CustomAdapter (private val magazineList:ArrayList<ModelMag>, val context: Context): RecyclerView.Adapter<CustomAdapter.ViewHolder> () {

    //var magazineList:ArrayList<ModelMag> = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       /* var v: View = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false) as View

        var viewHolder:MyViewHolder = MyViewHolder(v)

        return viewHolder*/

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return magazineList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       // var modelMag:ModelMag = magazineList.get(position)

        holder.bind(magazineList[position])


    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: ModelMag){
            with(itemView){
                articleTitle.text = item.title
                //articleImage.imageAlpha = item.image
            }
        }

        /*var articleTitle: TextView? = null
        var articleImage: ImageView? = null

        fun MyViewHolder(itemView: View) {
            super.itemView
            articleTitle = itemView.findViewById(R.id.title) as TextView
            articleImage = itemView.findViewById(R.id.image) as ImageView
        }*/
    }
}