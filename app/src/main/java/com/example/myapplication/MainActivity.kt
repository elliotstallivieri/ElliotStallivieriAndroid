package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myapplication.activity_home.HomeActivity
import android.content.Intent
//import com.example.myapplication.activity_home.HomeActivity.Companion.getStartedIntent

// ceci est la page de chargement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*Handler(Looper.getMainLooper()).postDelayed({
            startActivity(HomeActivity.getStartedIntent(this))
            finish()
        }, 2000)*/
    }
}