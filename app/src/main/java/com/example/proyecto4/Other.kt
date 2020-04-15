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
        val cl1 = cli.toInt()

        actionBar.setTitle(name)
        fillClimateFields(name)



        if(name == "Barranquilla"){
            mondayTemperature.text = "27.2°C"
            tuesdayTemperature.text = "27.4 °C"
            wednesdayTemperature.text = "26.7 °C"
            thirdsdayTemperature.text = "26.9 °C"
            fridayTemperature.text = "26.9°C"
        }

        if(name == "Bogotá"){
            mondayTemperature.text = "9.5°C"
            tuesdayTemperature.text = "11.7°C"
            wednesdayTemperature.text = "11.2°C"
            thirdsdayTemperature.text = "11.2°C"
            fridayTemperature.text = "10.7°C"

        }

        if(name == "Bucaramanga"){
            mondayTemperature.text = "20.5°C"
            tuesdayTemperature.text = "20.1°C"
            wednesdayTemperature.text = "20°C"
            thirdsdayTemperature.text = "20.9°C"
            fridayTemperature.text = "20.4°C"
        }


        if(name == "Cali"){
            mondayTemperature.text = "19.9°C"
            tuesdayTemperature.text = "19.5°C"
            wednesdayTemperature.text = "19.9°C"
            thirdsdayTemperature.text = "19.5°C"
            fridayTemperature.text = "20.2°C"
        }

        if(name == "Cartagena"){
            mondayTemperature.text = "27.1°C"
            tuesdayTemperature.text = "27°C"
            wednesdayTemperature.text = "26.4°C"
            thirdsdayTemperature.text = "26.7°C"
            fridayTemperature.text = "26.6°C"
        }

        if(name == "Cucuta"){
            mondayTemperature.text = "23.5°C"
            tuesdayTemperature.text = "24.3°C"
            wednesdayTemperature.text = "23.4°C"
            thirdsdayTemperature.text = "24.2°C"
            fridayTemperature.text = "23.3°C"
        }

        if(name == "Ibagué"){
            mondayTemperature.text = "19°C"
            tuesdayTemperature.text = "20.4°C"
            wednesdayTemperature.text = "19.1°C"
            thirdsdayTemperature.text = "18.9°C"
            fridayTemperature.text = "17.9°C"
        }

        if(name == "Medellín"){
            mondayTemperature.text = "17.4°C"
            tuesdayTemperature.text = "16.3°C"
            wednesdayTemperature.text = "16.3°C"
            thirdsdayTemperature.text = "16°C"
            fridayTemperature.text = "16.2°C"
        }

        if(name == "Pereira"){
            mondayTemperature.text = "17.1°C"
            tuesdayTemperature.text = "18°C"
            wednesdayTemperature.text = "17.1°C"
            thirdsdayTemperature.text = "17.2°C"
            fridayTemperature.text = "16.6°C"
        }

        if(name == "Soledad"){
            mondayTemperature.text = "27.4°C"
            tuesdayTemperature.text = "28.1°C"
            wednesdayTemperature.text = "26.9°C"
            thirdsdayTemperature.text = "27°C"
            fridayTemperature.text = "27°C"
        }


    }

    fun fillClimateFields(city: String) {

    }
}
