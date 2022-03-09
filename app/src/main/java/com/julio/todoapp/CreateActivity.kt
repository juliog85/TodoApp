package com.julio.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julio.todoapp.databinding.ActivityCreateBinding
import com.julio.todoapp.databinding.ActivityMainBinding

class CreateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners(){
        binding.btnSalvar.setOnClickListener{

        }
    }
}