package com.example.superapp.general

import com.example.superapp.base.BasePresenterInterface
import com.example.superapp.base.BaseViewInterface

interface GeneralContractInterface {

    interface View: BaseViewInterface {
        fun onTextViewButtonCkicked()
    }

    interface Presenter: BasePresenterInterface<View> {
        fun onTextViewButtonCkicked()
    }
}