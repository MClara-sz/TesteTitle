package com.example.baldappdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val COD_TELA = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnentrar(view: View) {
        val txtuser = findViewById<EditText>(R.id.txtuser)
        val user = txtuser.text.toString()
        //intent p trabalhar c/ mais de uma tela, passar um inf. p/ outro cara
        val intent = Intent(this, ActivityMenuPrincipal::class.java).apply {
            putExtra("sUser", user)
        }
        // startActivity(intent)
        startActivityForResult(intent, COD_TELA)
    }

}