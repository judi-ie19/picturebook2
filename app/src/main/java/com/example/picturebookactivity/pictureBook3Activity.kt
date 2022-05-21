package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook3Activity : AppCompatActivity() {
    lateinit var btnprevious1:Button
    lateinit var btnnext1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)
        btnprevious1=findViewById(R.id.btnprevious1)
        btnprevious1.setOnClickListener {
            val intent= Intent(this,pictureBook2Activity::class.java)
            startActivity(intent)

        }
        btnnext1=findViewById(R.id.btnnext)
        btnnext1.setOnClickListener {
            val intent= Intent(this,pictureBook4Activity::class.java)
            startActivity(intent)

        }
    }
}