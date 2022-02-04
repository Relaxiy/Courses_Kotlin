package com.example.myapplication

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    private val btn by lazy { findViewById<Button>(R.id.btn) }
    private val inputFirstName by lazy { findViewById<EditText>(R.id.inputFirstName) }
    private val inputSecondName by lazy { findViewById<EditText>(R.id.inputSecondName) }
    private val inputAge by lazy { findViewById<EditText>(R.id.inputAge) }
    private val userView by lazy { findViewById<TextView>(R.id.userView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
        initViews()
    }

    private fun createUser(): String{
        val user: User = User(inputFirstName.text.toString(),
            inputSecondName.text.toString(),
            inputAge.text.toString().toInt())
        return user.toString()
    }

    private fun initViews(){
        btn.setOnClickListener{
            if(inputFirstName.text.isEmpty() || inputSecondName.text.isEmpty() || inputAge.text.isEmpty()) {
                showToast("error!")
            } else {
                userView?.text = createUser()
            }
        }
    }

    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }
}