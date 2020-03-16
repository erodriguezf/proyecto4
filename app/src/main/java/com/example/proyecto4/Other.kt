package com.example.proyecto4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_other.*

class Other : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        //moverse al manifest

        var intent = intent
        val name = intent.getStringExtra("ciudad")
        val cli = intent.getStringExtra("clima")

        actionBar.setTitle(name)
        Dia.text = name
        clima.text = cli


    }
}
