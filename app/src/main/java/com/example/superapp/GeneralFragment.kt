package com.example.superapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.superapp.databinding.FragmentGeneralBinding

class GeneralFragment: Fragment(R.layout.fragment_general) {
    private var fragmentGeneralBinding: FragmentGeneralBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentGeneralBinding.bind(view)
        fragmentGeneralBinding = binding
        binding.textView.text = getString(R.string.hello)
    }

    override fun onDestroyView() {
        fragmentGeneralBinding = null
        super.onDestroyView()
    }
}