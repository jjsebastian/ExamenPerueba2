package com.utad.examenprueba2.ui.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utad.examenprueba2.R
import com.utad.examenprueba2.databinding.ActivityHomeWorkBinding
import com.utad.examenprueba2.ui.adapter.HomeWorkAdapte

class HomeWorkActivity : AppCompatActivity() {
    private lateinit var _binding : ActivityHomeWorkBinding
    private val binding: ActivityHomeWorkBinding get() = _binding

    private val adapter: HomeWorkAdapter = HomeWorkAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}