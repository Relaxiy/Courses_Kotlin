package com.example.lesson3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lesson3.ext.checkEmail
import com.example.lesson3.ext.dialog
import com.example.lesson3.ext.openFragment
import com.example.lesson3.models.User
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment: Fragment(R.layout.fragment_login) {

    companion object {
        const val TAG = "LoginFragment"
        const val USER_KEY = "user_key"
        fun newInstance() = LoginFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login()
    }

    private fun login(){
        btn_toUsernameFragment.setOnClickListener {
            if (inputLogin.text.isEmpty() ||
                inputEmail.text.isEmpty() ||
                inputPassword.text.isEmpty() ||
                !checkEmail(inputEmail.text.toString())){
                requireActivity().dialog()
            } else {
                val user = createUser()
                requireActivity().apply {
                    openFragment(
                        UsernameFragment.newInstance(user),
                        UsernameFragment.TAG,
                        R.id.container)
                }
            }
        }
    }

    private fun createUser(): User {
        return User(
            login = inputLogin.text.toString(),
            email = inputEmail.text.toString(),
            password = inputPassword.text.toString()
        )
    }


}