package com.example.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.Exception

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //Se utiliza adapter para agregar el arreglo al listview
        var adapter = ArrayAdapter(this, R.layout.listview_item, MyApplication.menuArray.menuOrder)
        menuList.adapter = adapter
        //La funion que agrega el item seleccionado al pedido
        menuList.setOnItemClickListener {
            parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            MyApplication.orderArray.add(MyApplication.menuArray.menuOrder[position])
            Toast.makeText( this,"Se ha agregado a la orden", Toast.LENGTH_SHORT).show()
        }
        //La funcion del boton que va a inicio
        button3.setOnClickListener {

            val intent:Intent = Intent(  this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
