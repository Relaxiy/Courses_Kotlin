package com.example.lesson3.ext

import android.util.Patterns
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

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
fun Fragment.showToast(message: String){
    val toast = Toast.makeText(activity, message, Toast.LENGTH_LONG)
    toast.setGravity(Gravity.TOP, 0, 0)
    toast.show()
}

