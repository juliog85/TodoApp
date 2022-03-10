package com.julio.todoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.julio.todoapp.R
import com.julio.todoapp.data.Todo
import com.julio.todoapp.databinding.ItemTodoBinding

class TodoAdapter(private val todos: List<Todo>) : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        val binding = ItemTodoBinding.bind(view)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val todo = todos[position]
        with(holder) {
            tvTitulo.text = todo.titulo
            tvDescricao.text = todo.descricao
        }
    }

    override fun getItemCount(): Int = todos.size

    class ViewHolder(itemView: ItemTodoBinding) : RecyclerView.ViewHolder(itemView.root) {
        val tvTitulo: TextView = itemView.tvTitulo
        val tvDescricao: TextView = itemView.tvDescricao
    }
}