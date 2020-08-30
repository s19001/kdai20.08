package com.example.memo2

interface TaskRepository {

    fun create(content: String, text1: String): Task

    fun update(task: Task)

    fun show(task: Task)

    fun findAll(): List<Task>

    fun findById(id: Long): Task?

}