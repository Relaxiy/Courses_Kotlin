package com.example.lesson3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.lesson3.ext.openFragment
import com.example.lesson3.models.User
import kotlinx.android.synthetic.main.fragment_username.*

class UsernameFragment: Fragment(R.layout.fragment_username) {

    companion object {
        const val TAG = "UsernameFragment"
        const val USER_KEY = "user_key"
        fun newInstance(user: User) = UsernameFragment().apply {
            arguments = Bundle().apply { putParcelable(USER_KEY, user) }
        }
    }

    private val user: User? by lazy { arguments?.getParcelable(USER_KEY) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewListener()
    }

    private fun onViewListener(){
        usernameClickable.text = user?.login
        usernameClickable.setOnClickListener {
            requireActivity().apply {
                openFragment(
                    AlldataFragment.newInstance(user),
                    AlldataFragment.TAG,
                    R.id.container)
            }
        }
    }
}