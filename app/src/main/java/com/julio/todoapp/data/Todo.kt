package com.julio.todoapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Todo(
    val titulo : String,
    val descricao : String
) : Parcelable
