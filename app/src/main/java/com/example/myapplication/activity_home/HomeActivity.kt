package com.example.myapplication.activity_home

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.LocationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.activity_scan.ScanActivity

/*
***** Cette activité sert en quelque sorte d'accueil, de menu principal *****
*/

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val boutonX = findViewById<Button>(R.id.Button_bouton1)
        boutonX.setOnClickListener{
            val intentRecView = Intent(this, ScanActivity::class.java)
            startActivity(intentRecView)
        }
    }





}