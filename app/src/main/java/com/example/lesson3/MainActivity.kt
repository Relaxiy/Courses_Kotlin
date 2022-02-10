package com.example.lesson3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson3.ext.openFragment

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initLoginFragment()
    }

    private fun initLoginFragment() {
        openFragment(LoginFragment.newInstance(), LoginFragment.TAG, R.id.container)
    }
}