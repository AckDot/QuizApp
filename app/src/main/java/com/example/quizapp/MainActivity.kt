package com.example.quizapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_main)
        val navController = Navigation.findNavController(this, R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.myNavHostFragment).navigateUp()
                || super.onSupportNavigateUp()
    }


}