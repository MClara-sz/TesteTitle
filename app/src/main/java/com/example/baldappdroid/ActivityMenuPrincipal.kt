package com.example.baldappdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.baldappdroid.R.*

class ActivityMenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_menu_principal )
        setSupportActionBar(findViewById(R.id.toolbar))
        val user = intent.getStringExtra("sUser")
        val txtuser = findViewById<TextView>(R.id.txtusermenu)
        txtuser.setText(user.toString())


    }
}