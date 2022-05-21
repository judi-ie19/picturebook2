package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook5Activity : AppCompatActivity() {
    lateinit var btnprevious:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book5)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            val intent= Intent(this,pictureBook4Activity::class.java)
            startActivity(intent)

        }
    }
}