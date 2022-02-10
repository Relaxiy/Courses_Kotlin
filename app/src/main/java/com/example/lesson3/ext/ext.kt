package com.example.lesson3.ext

import android.util.Patterns
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.lesson3.LoginFragment
import com.example.lesson3.dialog.LoginDialog

fun FragmentActivity.openFragment(fragment: Fragment, tag: String, id: Int){
    supportFragmentManager
        .beginTransaction()
        .add(id, fragment, tag)
        .addToBackStack(tag)
        .commit()
}

fun Fragment.checkEmail(email: String): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}

fun FragmentActivity.dialog(){
    val myDialogFragment = LoginDialog()
    val manager = supportFragmentManager
    myDialogFragment.show(manager, "myDialog")
}

