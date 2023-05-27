package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.ActionBar

class grprselectivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grprselectivity)

        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!?.hide()

        val spin2=findViewById<Spinner>(R.id.grandspin)
        val GPs= arrayOf<String?>(

            "Monza" , "Silverstone" , "Monaco", "Sturian" , "Hockenheim" , "Sao Paulo"
        )

        fun Monza(){
            val a= Intent(this, GPmap::class.java)
            startActivity(a)
        }
        fun Silver(){
            val b= Intent(this, GPmap2::class.java)
            startActivity(b)
        }
        fun Monaco(){
            val c= Intent(this, GPmap3::class.java)
            startActivity(c)
        }
        fun Stu(){
            val d= Intent(this, GPmap4::class.java)
            startActivity(d)
        }
        fun Hock(){
            val e= Intent(this, GPmap5::class.java)
            startActivity(e)
        }
        fun Sao(){
            val f= Intent(this, GPmap6::class.java)
            startActivity(f)
        }

        var submit= findViewById<Button>(R.id.sub)
        val ap2: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, GPs)
        ap2.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spin2.adapter=ap2
        spin2.onItemSelectedListener = object:

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                var y: Int
                y=p2
                submit.setOnClickListener {

                    when (y) {
                        0 -> Monza()
                        1 -> Silver()
                        2 -> Monaco()
                        3 -> Stu()
                        4 -> Hock()
                        5 -> Sao()

                    }
                }

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }


    }
}