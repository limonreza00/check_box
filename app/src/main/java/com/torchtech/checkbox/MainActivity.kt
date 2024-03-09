package com.torchtech.checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val superman = findViewById<CheckBox>(R.id.superman)
        val ironman = findViewById<CheckBox>(R.id.ironman)
        val batman = findViewById<CheckBox>(R.id.batman)
        val spiderman = findViewById<CheckBox>(R.id.spiderman)
        val deadpool = findViewById<CheckBox>(R.id.deadpool)
        val showButton = findViewById<Button>(R.id.showButton)
        val display = findViewById<TextView>(R.id.display)

        showButton.setOnClickListener {
            val text = "Your selected superhero is :\n"
            display.text =text
            if (superman.isChecked) display.append("Superman\n")
            if (ironman.isChecked) display.append("Ironman\n")
            if (batman.isChecked) display.append("Batman\n")
            if (spiderman.isChecked) display.append("Spiderman\n")
            if (deadpool.isChecked) display.append("Deadpool\n")
        }
    }
}