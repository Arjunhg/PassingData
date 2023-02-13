package com.example.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
         //Taking order

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        tvOrder.text=  ordersOfCustomer.toString()
    }
}