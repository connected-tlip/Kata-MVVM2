package com.connectedlab.example

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.connectedlab.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Instantiate Service (this would be dependency injected)
        val service = SignupService()
        // Instantiate view model
        val viewModel = SignupViewModel(service)
        // Bind view model to view
        binding.viewModel = viewModel
    }
}
