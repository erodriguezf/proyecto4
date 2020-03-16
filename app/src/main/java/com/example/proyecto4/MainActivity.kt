package com.example.proyecto4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Ciudad>()

        arrayList.add(Ciudad("Barranquilla",30 ,R.drawable.barranquilla))
        arrayList.add(Ciudad("Bogotá",10 ,R.drawable.bogota))
        arrayList.add(Ciudad("Bucaramanga",17 ,R.drawable.bucaramanga))
        arrayList.add(Ciudad("Cali",27 ,R.drawable.cali))
        arrayList.add(Ciudad("Cartagena",32 ,R.drawable.cartagena))
        arrayList.add(Ciudad("Cucuta",18 ,R.drawable.cucuta))
        arrayList.add(Ciudad("Ibagué",23 ,R.drawable.ibague))
        arrayList.add(Ciudad("Medellín",20 ,R.drawable.medellin))
        arrayList.add(Ciudad("Pereira",18 ,R.drawable.pereira))
        arrayList.add(Ciudad("Soledad",30 ,R.drawable.soledad))

        val adapter = Adapter(arrayList,this)

        recyc.layoutManager = LinearLayoutManager(this)
        recyc.adapter = adapter



    }
}
