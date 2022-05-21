package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook4Activity : AppCompatActivity() {
    lateinit var btnprevious2:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book4)
        btnprevious2=findViewById(R.id.btnprevious2)
        btnprevious2.setOnClickListener {
            val intent= Intent(this,pictureBook3Activity::class.java)
            startActivity(intent)

        }
        btnnext2=findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
            val intent= Intent(this,pictureBook5Activity::class.java)
            startActivity(intent)
        }
    }
}
