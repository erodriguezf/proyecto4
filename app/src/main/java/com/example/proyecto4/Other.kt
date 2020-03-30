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
        if(name == "Barranquilla"){
            Dia1.text = " lunes "
            val c1= 26.9;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 25.9  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 26.2 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 26.4 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 26.1;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 26.8;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 26.7;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Bogotá"){
            Dia1.text = " lunes "
            val c1= 17.2;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 16.6  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 16.6 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 16 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 16.2;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 17.5;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 18.9;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Bucaramanga"){
            Dia1.text = " lunes "
            val c1= 18.9;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 18.7  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 20 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 19.2 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 18.7;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 18.3;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 18.6;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Cali"){
            Dia1.text = " lunes "
            val c1= 28.4;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 26.5  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 27.9 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 29.1 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 27.4;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 27.2;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 27.5;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Cartagena"){
            Dia1.text = " lunes "
            val c1= 28.2;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 28.4  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 28 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 28 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 27.9;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 28.4;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 27.8;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Cucuta"){
            Dia1.text = " lunes "
            val c1= 29.2;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 29.4  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 27.4 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 25.7 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 26.7;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 25.5;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 26.5;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Ibagué"){
            Dia1.text = " lunes "
            val c1= 27.2;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 27.9  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 28.5 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 29.2 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 29.1;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 28.4;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 28.9;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }
        if(name == "Medellín"){
            Dia1.text = " lunes "
            val c1= 21.5;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 21.8  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 24.2 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 23 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 20.9;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 19;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 21.1;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }
        if(name == "Pereira"){
            Dia1.text = " lunes "
            val c1= 18.4;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 18.5  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 19 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 18.2 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 17.7;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 17.3;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 17.6;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }

        if(name == "Soledad"){
            Dia1.text = " lunes "
            val c1= 26.9;
            val cls = c1.toString()
            clima1.text = cls + "°C"
            Dia2.text = " martes "
            val c12= 25.9  ;
            val cls2 = c12.toString()
            clima2.text = cls2 + "°C"
            Dia3.text = " miercoles "
            val c3= 26.2 ;
            val c3s = c3.toString();
            clima3.text = c3s + "°C"
            Dia4.text = " jueves "
            val c4= 26.4 ;
            val c4s = c4.toString();
            clima4.text = c4s + "°C"
            Dia5.text = " viernes "
            val c5= 26.1;
            val c5s = c5.toString();
            clima5.text = c5s + "°C"
            Dia6.text = " sábado "
            val c6= 26.8;
            val c6s = c6.toString();
            clima6.text = c6s + "°C"
            Dia7.text = " domingo "
            val c7= 26.7;
            val c7s = c7.toString();
            clima7.text = c7s + "°C"

        }





    }
}
