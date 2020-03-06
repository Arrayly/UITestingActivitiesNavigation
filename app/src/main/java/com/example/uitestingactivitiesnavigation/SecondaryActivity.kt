package com.example.uitestingactivitiesnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
    }

    fun navigateBackClicked(view: View) {
        onBackPressed()
    }
}
