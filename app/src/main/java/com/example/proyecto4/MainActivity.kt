package com.example.proyecto4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import org.json.JSONObject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class MainActivity : AppCompatActivity() {

    private var globalVaribleToTest: String = "test before"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Ciudad>();
        Log.d("Test before", globalVaribleToTest)
        var result = getResponseData("Barranquilla")
        Log.d("Test after", globalVaribleToTest)
        Log.d("Response_result", result)

        arrayList.add(Ciudad("Barranquilla", "-20", R.drawable.barranquilla))
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

    private fun getResponseData(cityName: String): String{

        val url ="https://api.openweathermap.org/data/2.5/weather?q=%s,co&appid=b5ba7934ab85850c1e8b4f19cdc4cf50".format(cityName)
        var json =  JSONObject()
        var response: String = "null"
        CoroutineScope(Dispatchers.Main).launch{
            globalVaribleToTest = getData(url).toString()
        }

        return response
    }

    private fun parseObjectG(json: JSONObject): JSONObject{
        return json.getJSONObject("main")
    }

    private suspend fun getData(url: String) = suspendCoroutine<String?>{response ->

        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener { result->
                response.resume(result)
            },
            Response.ErrorListener { null }
        )
        queue.add(stringRequest)
    }
}