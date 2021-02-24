package com.example.superapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openGeneralFragment()
    }

    fun openGeneralFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, GeneralFragment())
            .commitNow()
    }
}