package com.example.proyecto4

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto4.model.Main
import kotlinx.android.synthetic.main.row.view.*

class Adapter(val arrayList: ArrayList<Ciudad>, val context: Context):
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.row,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            val ciudad = arrayList.get(position)

            var city : String = ciudad.ciudad
            var temperatura : String = ciudad.clima
            var imag: Int = ciudad.imagen

            val intent = Intent(context,Other::class.java)

            intent.putExtra("ciudad",city)
            intent.putExtra("clima",temperatura)
            intent.putExtra("imagen",imag)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindItems(ciudad: Ciudad){
            itemView.ciudad.text = ciudad.ciudad
            itemView.clima.text =  ciudad.clima + "°C"
            itemView.image.setImageResource(ciudad.imagen)
        }
    }
}