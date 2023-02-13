package com.example.passingdata

/* We will Transfer data of one screen to another
* extended version of explicit intent
* kotlin doesn't have static keyword so to get a global key equivalent to static in java , we use campanionobject in kotlin*/
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Creating key
    companion object{
        const val KEY = "com.example.passingdata.MainActivity.KEY" //const is a keyword
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val ordersPlaced = et1.text.toString() + " " + et2.text.toString() + " " +
            et3.text.toString() + " " + et4.text.toString()

            intent  = Intent(this, Order::class.java) //To jump From this screen to order screen
            intent.putExtra(KEY, ordersPlaced )
            startActivity(intent)
        }


    }
}