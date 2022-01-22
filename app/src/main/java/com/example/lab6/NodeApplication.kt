package com.example.lab6

import android.app.Application
import com.example.lab6.database.NodeDatabase
import com.example.lab6.repository.NodeRepository

class NodeApplication : Application() {
    val database by lazy { NodeDatabase.getDatabase(this) }
    val repository by lazy { NodeRepository(database.nodeDao()) }
}