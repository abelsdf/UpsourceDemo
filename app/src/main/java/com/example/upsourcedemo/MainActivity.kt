package com.example.upsourcedemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_hello_world.setOnClickListener {
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
        }
    }
}
