package com.example.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //Se utiliza adapter para agregar el arreglo al listview
        var adapter = ArrayAdapter(this, R.layout.listview_item, MyApplication.orderArray.menuOrder)
        adapter.notifyDataSetChanged()
        orderList.adapter = adapter
        //La funion que elimina el item seleccionado al pedido
        orderList.onItemLongClickListener = object: AdapterView.OnItemLongClickListener{
            override fun onItemLongClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long): Boolean {
                MyApplication.orderArray.del(position)
                Toast.makeText(applicationContext,"Se ha eliminado un elemento del pedido", Toast.LENGTH_SHORT).show()
                orderList.adapter = adapter
                return true
            }
        }
        //La funcion del boton que limpia la lista
        button4.setOnClickListener {
            MyApplication.orderArray.clear()
            orderList.adapter = adapter
        }
        //La funcion del boton que hace el pedido
        button5.setOnClickListener {
            MyApplication.orderArray.clear()
            orderList.adapter = adapter
            Toast.makeText( this,"Se ha realizado tu pedido", Toast.LENGTH_SHORT).show()
        }
        //La funcion del boton que va a inicio
        button6.setOnClickListener {

            val intent:Intent = Intent(  this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}
