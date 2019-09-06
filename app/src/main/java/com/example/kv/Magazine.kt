package com.example.kv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class Magazine : AppCompatActivity() {

    var timeline:ArrayList<ModelMag> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.magazine)

        addtimline()
        //get refrence of recyclerview
        var magazineView :RecyclerView = findViewById<RecyclerView>(R.id.recycle)
        //set a staggeredGridLayoutManager with 3 numbers of columns and vertical orientation
        magazineView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        magazineView.adapter = magazineAdapter(timeline)



    }

    fun addtimline(){

        timeline.add(ModelMag(1,20,R.drawable.masa1,"first"))
        timeline.add(ModelMag(2,25,R.drawable.images1,"second"))
        timeline.add(ModelMag(3,23,R.drawable.me,"third"))
        timeline.add(ModelMag(4,2,R.drawable.images1,"fourth"))
        timeline.add(ModelMag(5,2,R.drawable.images1,"fifth"))
        timeline.add(ModelMag(6,2,R.drawable.logo,"six"))
        timeline.add(ModelMag(7,2,R.drawable.images1,"seven"))

    }
}