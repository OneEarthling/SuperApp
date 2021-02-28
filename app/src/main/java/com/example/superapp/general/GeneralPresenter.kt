package com.example.superapp.general

import com.example.superapp.MainActivity
import com.example.superapp.R
import com.example.superapp.textView.TextViewFragment

class GeneralPresenter(private val activity: MainActivity): GeneralContractInterface.Presenter {
    override fun onTextViewButtonCkicked() {
        activity.supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, TextViewFragment())
                .addToBackStack(null)
                .commit()
    }
}