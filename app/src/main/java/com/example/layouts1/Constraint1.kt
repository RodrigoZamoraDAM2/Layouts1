package com.example.layouts1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Constraint1 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraintlayout1)

        var btn : Button = findViewById(R.id.innerConstraint)

        btn.setOnClickListener(){
            startActivity(Intent(this@Constraint1,Constraint2::class.java))
        }
    }
}