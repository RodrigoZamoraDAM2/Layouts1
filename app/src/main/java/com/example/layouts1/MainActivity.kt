package com.example.layouts1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLinear : Button = findViewById(R.id.Linearbutton)
        var btnTable : Button = findViewById(R.id.TableButton)
        var btnConstraint : Button = findViewById(R.id.ConstraintButton)

        btnLinear.setOnClickListener(){
            startActivity(Intent(this@MainActivity,Linear1::class.java))
        }
        btnTable.setOnClickListener(){
            startActivity(Intent(this@MainActivity,Table1::class.java))
        }
        btnConstraint.setOnClickListener(){
            startActivity(Intent(this@MainActivity,Constraint1::class.java))
        }
    }
}