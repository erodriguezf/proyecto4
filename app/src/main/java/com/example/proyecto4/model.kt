package com.example.proyecto4

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class model(application: Application) : AndroidViewModel(application)  {
    private var Dao : Dao

    init {
        Dao = com.example.proyecto4.Dao.getInstance(this.getApplication())
    }

    fun addDias(url:String, type:Int) {
       Dao.addDias(url, type)
    }






}