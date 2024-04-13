package com.example.nighteventquixada

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private  val listItems: ArrayList<Event>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return listItems.size;
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvItemTitle: TextView = view.findViewById(R.id.tv_title);
        val tvItemDescription: TextView = view.findViewById(R.id.tv_description);
        val cvCardView: CardView = view.findViewById(R.id.cv_card_item);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false);

        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvItemTitle.setText(listItems[position].title);
        holder.tvItemDescription.setText(listItems[position].description);
        holder.cvCardView.setBackgroundResource(holder.itemView.getResources().getIdentifier(listItems[position].idImage.toString(), "drawable", holder.itemView.getContext().getPackageName()));
        holder.cvCardView.background.alpha = 70;
    }
}