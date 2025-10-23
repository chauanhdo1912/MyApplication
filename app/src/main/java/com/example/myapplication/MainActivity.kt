package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val helloButton = findViewById<Button>(R.id.Button)
        helloButton.setText("Hello World")

        helloButton.setOnClickListener {

            onClick()


        }
    }

    private fun onClick() {
        val helloButton1 = findViewById<Button>(R.id.Button)
        helloButton1.setText("Welt")



    }


}









