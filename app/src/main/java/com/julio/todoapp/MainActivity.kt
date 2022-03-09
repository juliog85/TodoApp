package com.julio.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.julio.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners(){
        //listener botão add
        binding.fabAdd.setOnClickListener{
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
        }
    }

}