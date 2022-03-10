package com.julio.todoapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.julio.todoapp.data.Todo
import com.julio.todoapp.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        with(binding) {
            btnSalvar.setOnClickListener {
                val todo = Todo(
                    titulo = etTitulo.text.toString(),
                    descricao = etDescricao.text.toString()
                )
                val intent = Intent()
                intent.putExtra("TODO", todo)
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}

