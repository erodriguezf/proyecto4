package com.example.proyecto4

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject

class Dao private constructor(var context: Context) {
    private val ds1 = MutableLiveData<List<Diasemana>>()
    private val cities = MutableLiveData<List<Dias>>()
    private val ds2 = mutableListOf<Diasemana>()
    private var queue: RequestQueue


    init {
        queue = VolleySingleton.getInstance(context).requestQueue
    }

    companion object {
        @Volatile
        private var INSTANCE: Dao? = null

        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Dao(context).also { INSTANCE = it }
            }
    }

    fun addDias(url: String, type: Int) {
        VolleySingleton.getInstance(context).addToRequestQueue(getJsonObject(url, type))

    }

    internal fun getDias() = ds2
    internal fun getCities() = cities

    fun getJsonObject(url: String, type: Int): JsonObjectRequest {

        val JOR = JsonObjectRequest(
            Request.Method.GET, url, null,
            Response.Listener { response ->
                println("bien " + type)
                parseObjectG(response, type)

            },
            Response.ErrorListener { error ->
                Log.d("WebRequestTest", "That didn't work ${error.message}")
            }
        )
        return JOR
    }

    private fun parseObjectG(response: JSONObject, type: Int) {
        val list = Diasemana.getCityFore(response, type)
        println(response)
        val i: Int = 0
        val size: Int = list.size
        if (type == 1) {
            for (i in 0 until size) {
                val fore = list[i]
                ds2.add(fore)
            }
        }


    }
}