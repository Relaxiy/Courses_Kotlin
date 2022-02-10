package com.example.lesson3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lesson3.models.User
import kotlinx.android.synthetic.main.fragment_alldata.*

class AlldataFragment: Fragment(R.layout.fragment_alldata) {
    companion object {
        const val TAG = "AlldataFragment"
        const val USER_KEY = "user_key"
        fun newInstance(user: User?) = AlldataFragment()
            .apply {
                arguments = Bundle().apply { putParcelable(USER_KEY, user) }
            }
    }

    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        loginView.text = user?.login
        emailView.text = user?.email
        passwordView.text = user?.password
    }

}