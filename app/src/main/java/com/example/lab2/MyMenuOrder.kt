package com.example.lab2

import com.example.lab2.MenuOrder

class MyMenuOrder(arrayList: ArrayList<String>) : MenuOrder {
    //Se implementan todos los atributos y metodos de MenuOrder
    override val menuOrder: ArrayList<String> = arrayList

    override fun add(element: String) {
        menuOrder.add(element)
    }

    override fun clear() {
        menuOrder.clear()
    }

    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}