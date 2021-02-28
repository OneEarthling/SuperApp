package com.example.superapp.general

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.superapp.MainActivity
import com.example.superapp.R
import com.example.superapp.databinding.FragmentGeneralBinding

class GeneralFragment: Fragment(R.layout.fragment_general) {
    private lateinit var generalPresenter: GeneralContractInterface.Presenter
    private var fragmentGeneralBinding: FragmentGeneralBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentGeneralBinding.bind(view)
        fragmentGeneralBinding = binding

        binding.textViewButton.setOnClickListener {
            generalPresenter.onTextViewButtonCkicked()
        }

        activity?.actionBar?.setDisplayHomeAsUpEnabled(false)
        activity?.actionBar?.setHomeButtonEnabled(false)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        generalPresenter = GeneralPresenter(activity as MainActivity)
    }

    override fun onDestroyView() {
        fragmentGeneralBinding = null
        super.onDestroyView()
    }
}