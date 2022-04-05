package com.redwars22.engeralta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val generatePasswordButton = findViewById<Button>(R.id.button)

        generatePasswordButton.setOnClickListener {
            generateRandom()
        }

        //generateRandom()
    }

    private fun generateRandom(){
        var textID: TextView? = null
        val password: String =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" +
                    "!@#$%&*()-_+=`´{[]}^~:;.,<>"
        var x = 0
        val n = 16
        var passwordChar: String?

        textID = findViewById(R.id.textview)
        textID.setText("")

        while(x < n){
            var index = Random.nextInt(password.length)

            if(Random.nextInt(2) == 0)
                passwordChar = password[index].lowercase()
            else
                passwordChar = password[index].uppercase()

            val passwordString: String = textID.getText().toString() + passwordChar
            textID.setText(passwordString)
            x++
        }
    }
}