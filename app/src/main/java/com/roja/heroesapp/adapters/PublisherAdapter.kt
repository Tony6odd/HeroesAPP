package com.roja.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.roja.heroesapp.R
import com.roja.heroesapp.models.Publisher
import com.squareup.picasso.Picasso


class PublisherAdapter(
    private val publishers: List<Publisher>,
    private val onItemClicked: (Publisher) -> Unit
) : RecyclerView.Adapter<PublisherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publishers[position]
        holder.publisherTextView.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)

        holder.itemView.setOnClickListener {
            onItemClicked(publisher)
        }
    }
}

class PublisherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val publisherImage: ImageView = view.findViewById(R.id.publisher_image)
    val publisherTextView: TextView = view.findViewById(R.id.publisher_name)
}
