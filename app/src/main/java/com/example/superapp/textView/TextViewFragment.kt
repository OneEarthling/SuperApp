package com.example.superapp.textView

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.superapp.R
import com.example.superapp.databinding.TextViewFragmentBinding

class TextViewFragment: Fragment(R.layout.text_view_fragment) {
    private var fragmentTextViewtBinding: TextViewFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = TextViewFragmentBinding.bind(view)
        fragmentTextViewtBinding = binding

    }

    override fun onDestroyView() {
        fragmentTextViewtBinding = null
        super.onDestroyView()
    }
}