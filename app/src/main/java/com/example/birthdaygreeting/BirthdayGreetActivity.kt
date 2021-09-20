package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet2)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val name = intent.getStringExtra(NAME_EXTRA)
        textView2.text = "Happy Birthday $name"
    }
}