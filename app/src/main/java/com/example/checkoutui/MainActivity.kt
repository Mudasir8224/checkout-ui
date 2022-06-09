package com.example.checkoutui

import android.os.Build
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        addData()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun addData() {
        val data = ArrayList<ItemsViewModel>()
        data.add(ItemsViewModel(R.drawable.img1, "PS-VITA ", "1026 6th Ave"))
        data.add(ItemsViewModel(R.drawable.img2, "SuperGame ", "32E 14th St"))
        data.add(ItemsViewModel(R.drawable.img3, "Trixi ", "86E 3rd St"))
        adapter = CustomAdapter(data)
        recyclerView.adapter = adapter
    }
}