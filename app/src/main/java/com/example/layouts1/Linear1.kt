package com.example.layouts1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Linear1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout1)

        var btn : Button = findViewById(R.id.innerLinear)

        btn.setOnClickListener(){
            startActivity(Intent(this@Linear1,Linear2::class.java))
        }
    }

}