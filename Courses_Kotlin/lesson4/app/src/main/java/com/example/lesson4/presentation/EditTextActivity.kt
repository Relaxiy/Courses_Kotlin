package com.example.lesson4.presentation

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson4.R
import com.example.lesson4.domain.models.GraphicCardPresent

class EditTextActivity: AppCompatActivity() {

    private val editButton by lazy {
        findViewById<EditText>(R.id.editButtonSheet)
    }

    private fun textViewClick(item: GraphicCardPresent) {
        editButton.setText(item.graphicCard)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)
        bottomFragmentInit()
    }

    private fun bottomFragmentInit(){
        editButton.setOnClickListener{
            val bottomDialog = CardsBottomFragment.newInstance{ card ->
                textViewClick(card)
            }
            bottomDialog.show(supportFragmentManager, CardsBottomFragment.TAG)
        }
    }

}