package com.example.superapp.general

import com.example.superapp.MainActivity
import com.example.superapp.R
import com.example.superapp.base.BasePresenter
import com.example.superapp.textView.TextViewFragment

class GeneralPresenter(): BasePresenter<GeneralContractInterface.View>(),
        GeneralContractInterface.Presenter {
    override fun onTextViewButtonCkicked() {
        view?.onTextViewButtonCkicked()
    }

}