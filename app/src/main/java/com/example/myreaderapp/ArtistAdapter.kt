package com.example.myreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ArtistAdapter(var artistList:List<Artist>):RecyclerView.Adapter<ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.reader_app, parent, false)
        return  ArtistViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  artistList.size
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val artist = artistList[position]
        holder.rtName.text = artist.name
        holder.rttitle.text = artist.title
        holder.rtPublishingDate.text = artist.date
        holder.rtSummary.text = artist.summary

    }

}
class ArtistViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var rtName = itemView.findViewById<TextView>(R.id.rtName)
    var rttitle = itemView.findViewById<TextView>(R.id.rtTitle)
    var rtPublishingDate = itemView.findViewById<TextView>(R.id.rtPublishingDate)
    var rtSummary = itemView.findViewById<TextView>(R.id.rtSummary)



}