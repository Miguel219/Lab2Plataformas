package com.example.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //La funcion del boton que va al menu
        button.setOnClickListener {

            val intent:Intent = Intent(  this, Main2Activity::class.java)
            startActivity(intent)
            finish()
        }
        //La funcion del boton que va al pedido
        button2.setOnClickListener {

            val intent:Intent = Intent(  this, Main3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
