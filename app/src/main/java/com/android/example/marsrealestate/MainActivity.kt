package com.android.example.marsrealestate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.marsrealestate.R

class MainActivity : AppCompatActivity() {

    /**
     * Our MainActivity is only responsible for setting the content view that contains the
     * Navigation Host.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}