package com.example.f1

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val actionBar: ActionBar?
        actionBar = supportActionBar
        actionBar!!?.hide()

        val v1: VideoView
        v1 = findViewById(R.id.v)
        v1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.f1gid)
        v1.start()

        val v2: VideoView
        v2 = findViewById(R.id.vv)
        v2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lights2)
        v2.start()

        val timer11 = Timer()
        timer11.schedule(object : TimerTask() {
                override fun run() {
                    val intent = Intent(this@MainActivity, SecondPageActual::class.java)
                    startActivity(intent)
                    finish()
                }
            }, 3500)


    }

}


