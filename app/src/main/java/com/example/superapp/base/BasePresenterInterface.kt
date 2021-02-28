package com.example.superapp.base

interface BasePresenterInterface<V: BaseViewInterface> {

    val isAttached: Boolean
    fun attach(view: V)
    fun detach()

}