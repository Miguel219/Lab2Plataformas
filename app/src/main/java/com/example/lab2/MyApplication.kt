package com.example.lab2

import android.app.Application
import android.content.Context

class MyApplication: Application() {
    //Se utiliza companion para que sea un objeto global
    companion object {
        val menuArray = MyMenuOrder(arrayListOf<String>("Pieza de pollo","Carne","Alitas","Shuco","Hamburguesa","Tacos","Burrito"))
        var orderArray = MyMenuOrder(arrayListOf<String>())
    }

}