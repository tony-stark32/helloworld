package com.jarvis.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.jarvis.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val et:EditText =findViewById(R.id.EditText1)
    val editTextInput = et.text

    val btn: Button =findViewById(R.id.button)
    btn.setOnClickListener(){
    Toast.makeText(this@MainActivity,""+editTextInput,Toast.LENGTH_SHORT).show()

        val edt: EditText =findViewById(R.id.EditText1)
}
}
}