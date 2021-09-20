package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.birthdaygreeting.BirthdayGreetActivity.Companion.NAME_EXTRA

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun wishBirthday(view: View) {
        editText = findViewById(R.id.editText)
        val name = editText.editableText.toString()
        val intent = Intent(this,BirthdayGreetActivity::class.java)
        intent.putExtra(NAME_EXTRA,name)
        startActivity(intent)


    }
}