package com.roja.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.roja.heroesapp.R
import com.roja.heroesapp.models.Publisher2
import com.squareup.picasso.Picasso

class Publisher2Adapter(
    private val publishers2: MutableList<Publisher2>,
    private val onItemClicked: (Publisher2) -> Unit
) : RecyclerView.Adapter<Publisher2ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Publisher2ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return Publisher2ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers2.count()
    }

    override fun onBindViewHolder(holder: Publisher2ViewHolder, position: Int) {
        val publisher2 = publishers2[position]
        holder.publisherTextView.text = publisher2.name
        Picasso.get().load(publisher2.image).into(holder.publisherImage)

        holder.itemView.setOnClickListener {
            onItemClicked(publisher2)
        }
    }
}

class Publisher2ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val publisherImage: ImageView = view.findViewById(R.id.publisher_image)
    val publisherTextView: TextView = view.findViewById(R.id.publisher_name)
}
