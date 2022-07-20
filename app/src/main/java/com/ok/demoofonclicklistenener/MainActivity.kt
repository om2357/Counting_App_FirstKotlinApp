package com.ok.demoofonclicklistenener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 *
 */
class MainActivity : AppCompatActivity() {
    /**
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myText = findViewById<TextView>(R.id.textView1)
        val myButton = findViewById<Button>(R.id.Button1)
        val myText1 = findViewById<TextView>(R.id.textView2)
        var timeClicked = 0

        myButton.setOnClickListener {
            myText.text = "I Think You Are Happy Now"
            timeClicked += 1
            myText1.text = timeClicked.toString()
            Toast.makeText(this, "Counting Start $timeClicked", Toast.LENGTH_SHORT).show()
        }
    }
}