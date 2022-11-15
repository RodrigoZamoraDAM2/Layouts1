package com.example.layouts1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Table1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablelayout1)

        var btn : Button = findViewById(R.id.innerTable)

        btn.setOnClickListener(){
            startActivity(Intent(this@Table1,Table2::class.java))
        }
    }
}