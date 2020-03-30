package com.example.proyecto4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.example.proyecto4.model.Main
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row.*
import org.json.JSONArray
import org.json.JSONObject
import kotlin.error

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val url1 ="http://api.openweathermap.org/data/2.5/weather?q=Barranquilla,co&appid=b5ba7934ab85850c1e8b4f19cdc4cf50"
        /*button.setOnClickListener {
          VolleySingleton.getInstance(this ).addToRequestQueue(getJsonObjectRequest())
      }*/


         val arrayList = ArrayList<Ciudad>();
        arrayList.add(Ciudad("Barranquilla","28",R.drawable.barranquilla))
        arrayList.add(Ciudad("Bogotá", "14", R.drawable.bogota))
        arrayList.add(Ciudad("Bucaramanga", "23", R.drawable.bucaramanga))
        arrayList.add(Ciudad("Cali", "23", R.drawable.cali))
        arrayList.add(Ciudad("Cartagena", "26", R.drawable.cartagena))
        arrayList.add(Ciudad("Cucuta", "26", R.drawable.cucuta))
        arrayList.add(Ciudad("Ibagué", "22", R.drawable.ibague))
        arrayList.add(Ciudad("Medellín", "15", R.drawable.medellin))
        arrayList.add(Ciudad("Pereira", "21", R.drawable.pereira))
        arrayList.add(Ciudad("Soledad", "28", R.drawable.soledad))



        val adapter = Adapter(arrayList, this)
        recyc.layoutManager = LinearLayoutManager(this)
        recyc.adapter = adapter

    }
}




















