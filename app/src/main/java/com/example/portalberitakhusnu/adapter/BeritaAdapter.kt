package com.example.portalberitakhusnu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portalberitakhusnu.R
import com.example.portalberitakhusnu.data.Berita
import com.example.portalberitakhusnu.data.Komentar

class BeritaAdapter (private val list: ArrayList<Berita>)
    : RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>(){
    class BeritaViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        private val txtJudul = itemView.findViewById<TextView>(R.id.txtJudulBerita)
        private val imgGambar = itemView.findViewById<ImageView>(R.id.imgGambarBerita)
        private val txtDecs = itemView.findViewById<TextView>(R.id.txtDescBerita)

        fun bind(get: Berita){
            txtJudul.text = get.judul
            //imgGambar.setImageResource()
            txtDecs.text = get.decs

            txtJudul.setOnClickListener{

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        return BeritaViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_berita, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BeritaViewHolder, position: Int) {
        holder.bind(list[position])
    }


}