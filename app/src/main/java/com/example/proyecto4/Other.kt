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
        val cli = intent.getStringExtra("clima") + "°C"

        actionBar.setTitle(name)
        Dia1.text = " lunes "
        clima1.text = cli
        Dia2.text = " martes "
        clima2.text = cli
        Dia3.text = " miercoles "
        clima3.text = cli
        Dia4.text = " jueves "
        clima4.text = cli
        Dia5.text = " viernes "
        clima5.text = cli
        Dia6.text = " sábado "
        clima6.text = cli
        Dia7.text = " domingo "
        clima7.text = cli



    }
}
