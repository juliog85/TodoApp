package com.julio.todoapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.julio.todoapp.adapter.TodoAdapter
import com.julio.todoapp.data.Todo
import com.julio.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var todoAdapter: TodoAdapter

    private val todos = mutableListOf<Todo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
        setupAdapter()
    }

    private fun setupListeners() {
        //listener botão add
        binding.fabAdd.setOnClickListener {
            openActivityForResult()
        }
    }

    private fun setupAdapter(){
        todoAdapter = TodoAdapter(todos)
        binding.rvTodo.adapter = todoAdapter
    }

    private fun openActivityForResult() {
        startForResult.launch(Intent(this, CreateActivity::class.java))
    }

    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                intent?.getParcelableExtra<Todo>("TODO")?.let{
                todos.add(it)
                }
            }
        }
}