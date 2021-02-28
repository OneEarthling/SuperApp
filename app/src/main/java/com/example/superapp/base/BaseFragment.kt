package com.example.superapp.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

open class BaseFragment(@LayoutRes contentLayoutId: Int) : Fragment(contentLayoutId)