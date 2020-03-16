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

           /* if(position == 0){
                Toast.makeText(context,"Bienvenido a Barranquilla",Toast.LENGTH_SHORT).show()
            }

            if(position == 1){
                Toast.makeText(context,"Bienvenido a Bogotá",Toast.LENGTH_SHORT).show()
            }

            if(position == 2){
                Toast.makeText(context,"Bienvenido a Bucaramanga",Toast.LENGTH_SHORT).show()
            }

            if(position == 3){
                Toast.makeText(context,"Bienvenido a Cali",Toast.LENGTH_SHORT).show()
            }

            if(position == 4){
                Toast.makeText(context,"Bienvenido a Cartagena",Toast.LENGTH_SHORT).show()
            }

            if(position == 5){
                Toast.makeText(context,"Bienvenido a Cucuta",Toast.LENGTH_SHORT).show()
            }

            if(position == 6){
                Toast.makeText(context,"Bienvenido a Ibagué",Toast.LENGTH_SHORT).show()
            }

            if(position == 7){
                Toast.makeText(context,"Bienvenido a Medellín",Toast.LENGTH_SHORT).show()
            }

            if(position == 8){
                Toast.makeText(context,"Bienvenido a Pereira",Toast.LENGTH_SHORT).show()
            }

            if(position == 9){
                Toast.makeText(context,"Bienvenido a Soledad",Toast.LENGTH_SHORT).show()
            }*/

            val ciudad = arrayList.get(position)

            var city : String = ciudad.ciudad
            var temperatura : String = ciudad.clima.toString()
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
            itemView.clima.text = ciudad.clima.toString()
            itemView.image1.setImageResource(ciudad.imagen)




        }

    }


}