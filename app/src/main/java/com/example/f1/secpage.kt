package com.example.f1

import android.content.Intent
import android.hardware.biometrics.BiometricManager.Strings
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.Arrays

class secpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secpage)

        val actionBar: ActionBar?
        actionBar=supportActionBar
        actionBar!!.hide()

        var mp: MediaPlayer

        fun playSound() {

            mp = MediaPlayer.create(this, R.raw.f11radio)

            mp.start()

        }

        fun open3() {

            val ope= Intent(this, thrd::class.java)
            startActivity(ope)
        }

        fun sainz()
        {

            open3()
            val str61="Carlos Sainz Jr."
            val str62= "Place of Birth:\n" +
                    "Madrid, Spain"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg6", str61)
            a.putExtra("no6", str62)
            startActivity(a)

        }

        fun russel()
        {

            open3()
            val str41="George Russell"
            val str42= "Place of Birth:\n" +
                    "Norfolk, England"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg4", str41)
            a.putExtra("no4", str42)
            startActivity(a)

        }

        fun leclerc()
        {

            open3()
            val str51="Charles Leclerc"
            val str52= "Place of Birth:\n" +
                    "Monte Carlo, Monaco"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg5", str51)
            a.putExtra("no5", str52)
            startActivity(a)
        }

        fun hamilton()
        {

            open3()
            val str31="Lewis Hamilton"
            val str32= "Place of Birth:\n" +
                    "Stevenage, England"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg3", str31)
            a.putExtra("no3", str32)
            startActivity(a)

        }

        fun verstappen()
        {
            open3()
            val str11="Max Verstappen"
            val str12= "Place of Birth:\n" +
                    "Hasselt, Belgium"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg1", str11)
            a.putExtra("no1", str12)
            startActivity(a)
        }

        fun perez()
       {
           open3()
           val str21="Sergio Perez"
           val str22= "Place of Birth:\n" +
                   "Guadalajara, Mexico"
            val a=Intent(this, thrd::class.java)
            a.putExtra("msg2", str21)
            a.putExtra("no2", str22)
            startActivity(a)
        }

        val btn2= findViewById<Button>(R.id.b9)

        btn2.setOnClickListener {
            val bck= Intent(this, SecondPageActual::class.java )
            startActivity(bck)

        }

        val Drivers= arrayOf<String?>(

            "Max Verstappen" , "Sergio Perez" , "Lewis Hamilton", "George Russell" , "Charles Leclerc" , "Carlos Sainz" , "Fernando Alonso" , "Lance Stroll"
        )

        val btpres= findViewById<Button>(R.id.b0)
        val sp=findViewById<Spinner>(R.id.spin)
        val ap: ArrayAdapter<*> = ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, Drivers)
        ap.setDropDownViewResource(android.R.layout.simple_spinner_item)
        sp.adapter=ap
        sp.onItemSelectedListener = object:

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                var x: Int
                x=p2
                btpres.setOnClickListener {

                    playSound()

                    when(x)
                    {
                        0-> verstappen()
                        1-> perez()
                        2->hamilton()
                        3->russel()
                        4->leclerc()
                        5->sainz()



                    }
                }


            }
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

    }
}