package com.example.proyecto4

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlin.coroutines.coroutineContext
import kotlin.coroutines.suspendCoroutine

class VolleySingleton constructor(context: Context) {

    companion object{
        @Volatile
        private var INSTANCE: VolleySingleton? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: VolleySingleton(context).also { INSTANCE = it }
            }
    }

    val requestQueue : RequestQueue by lazy {
        Volley.newRequestQueue(context.applicationContext)
    }

    fun <T> addToRequestQueue(req: Request<T>){
        requestQueue.add(req)
    }
}
