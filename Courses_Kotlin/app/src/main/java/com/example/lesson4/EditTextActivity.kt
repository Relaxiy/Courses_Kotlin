package com.example.lesson4

import BottomFragment
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson4.recycler.clickListener.EditButtonToFragment

class EditTextActivity: AppCompatActivity() {

    private val editButton by lazy {
        findViewById<EditText>(R.id.editButtonSheet)
    }

    private val returnButton by lazy {
        object : EditButtonToFragment {
            override fun getButton() = editButton
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)
        bottomFragmentInit()
    }

    private fun bottomFragmentInit(){
        editButton.setOnClickListener{
            val bottomDialog = BottomFragment.newInstance(returnButton)
            bottomDialog.show(supportFragmentManager, BottomFragment.TAG)
        }
    }

}