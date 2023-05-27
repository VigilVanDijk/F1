package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class SecondPageActual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page_actual)

        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!?.hide()

        val seldriverbtn=findViewById<Button>(R.id.drbtn)
        val selgrprbtn=findViewById<Button>(R.id.grprbtn)

        seldriverbtn.setOnClickListener {
            val go1= Intent(this, secpage::class.java )
            startActivity(go1)

        }

        selgrprbtn.setOnClickListener {

            val go2= Intent(this, grprselectivity::class.java )
            startActivity(go2)


        }




    }
}