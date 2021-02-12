package com.example.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.btClick)
        val listener = HelloListener()
        btClick.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(view: View?) {
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.textView)
            val inputStr = input.text.toString()
            if(inputStr == "")
                output.text = "入力されてないよ"
            else
                output.text = inputStr + "さん、こんにちはにも！"
        }
    }
}