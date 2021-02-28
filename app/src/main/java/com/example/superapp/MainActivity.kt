package com.example.superapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.superapp.general.GeneralFragment
import com.example.superapp.textView.TextViewFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openGeneralFragment()

        val actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun openGeneralFragment(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, GeneralFragment())
            .commitNow()
    }

    fun openTextViewScreen(){
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, TextViewFragment())
                .addToBackStack(null)
                .commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() == android.R.id.home) {
            //Title bar back press triggers onBackPressed()
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    //Both navigation bar back press and title bar back press will trigger this method
    override fun onBackPressed() {
        if (fragmentManager.backStackEntryCount > 0) {
            fragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}