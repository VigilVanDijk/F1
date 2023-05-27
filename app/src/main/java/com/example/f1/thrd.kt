package com.example.f1

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class thrd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thrd)

        val actionBar: ActionBar?
        actionBar=supportActionBar
        actionBar!!?.hide()

        val back=findViewById<Button>(R.id.bb)
        back.setOnClickListener {
            val back= Intent(this, secpage::class.java )
            startActivity(back)
        }
        val img=findViewById<ImageView>(R.id.dp)
        val noimg= findViewById<ImageView>(R.id.dno)
        val rec= findViewById<TextView>(R.id.about)
        val numb=findViewById<TextView>(R.id.no)
        val b=intent
        val st10= b.getStringExtra("msg1")
        val no11=b.getStringExtra("no1")
        val st20=b.getStringExtra("msg2")
        val no21=b.getStringExtra("no2")
        val st30=b.getStringExtra("msg3")
        val no31=b.getStringExtra("no3")
        val st40=b.getStringExtra("msg4")
        val no41=b.getStringExtra("no4")
        val st50=b.getStringExtra("msg5")
        val no51=b.getStringExtra("no5")
        val st60=b.getStringExtra("msg6")
        val no61=b.getStringExtra("no6")
        if(st10=="Max Verstappen" ) {
            rec.text=st10
            numb.text=no11
            img.setBackgroundResource(R.drawable.maxffff11)
            noimg.setBackgroundResource(R.drawable.maxno)

        }
        if(st20=="Sergio Perez")
        {
            rec.text=st20
            numb.text=no21
            img.setBackgroundResource(R.drawable.checogud)
            noimg.setBackgroundResource(R.drawable.checono)
        }
        if(st30=="Lewis Hamilton")
        {
            rec.text=st30
            numb.text=no31
            img.setBackgroundResource(R.drawable.lewismaz)
            noimg.setBackgroundResource(R.drawable.lewisno1)

        }
        if(st40=="George Russell")
        {
            rec.text=st40
            numb.text=no41
            img.setBackgroundResource(R.drawable.russelgud1)
            noimg.setBackgroundResource(R.drawable.russelno)

        }
        if(st50=="Charles Leclerc")
        {
            rec.text=st50
            numb.text=no51
            img.setBackgroundResource(R.drawable.lecgud)
            noimg.setBackgroundResource(R.drawable.lecno)

        }
        if(st60=="Carlos Sainz Jr.")
        {
            rec.text=st60
            numb.text=no61
            img.setBackgroundResource(R.drawable.saizgud1)
            noimg.setBackgroundResource(R.drawable.sainzno)

        }



    }
}