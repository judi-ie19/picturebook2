package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook2Activity : AppCompatActivity() {
    lateinit var btnprevious:Button
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book2)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent= Intent(this,pictureBook3Activity::class.java)
            startActivity(intent)

        }
    }
}